package avatar;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Dirty cache
 *
 * @author mamad
 * @since 09/11/14.
 */
public class SimpleCache<K, V> implements Cache<K, V> {
    private final CacheLoader<K, V> loader;
    private final Lock lock = new ReentrantLock(true);
    private Map<K, V> cache = Collections.synchronizedMap(new HashMap<K, V>());

    public SimpleCache(CacheLoader<K, V> loader) {
        this.loader = loader;
    }

    public V get(K cacheKey) {
        V value = cache.get(cacheKey);
        if (value == null) {
            try {
                lock.lock();
                value = cache.get(cacheKey);
                if (value == null) {
                    try {
                        value = loader.load(cacheKey);
                    } catch (Exception e) {
                        throw new RuntimeException("Could not load key:" + cacheKey, e);
                    }
                    cache.put(cacheKey, value);
                }
            } finally {
                lock.unlock();
            }
        }

        return value;
    }
}