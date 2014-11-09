package avatar;

/**
 * @author mamad
 * @since 09/11/14.
 */
public interface CacheLoader<K, V> {
    V load(K key) throws Exception;
}
