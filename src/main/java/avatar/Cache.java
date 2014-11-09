package avatar;

/**
 * @author mamad
 * @since 09/11/14.
 */
public interface Cache<K, V> {
    V get(K cacheKey);
}
