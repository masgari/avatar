package avatar;

import static avatar.CacheKey.of;
import static avatar.CacheLoaderImpl.EMPTY;
import static avatar.DarkColors.nextColor;

/**
 * @author mamad
 * @since 09/11/14.
 */
public class LetterAvatarGenerator {

    private final Cache<CacheKey, byte[]> cache = new SimpleCache<CacheKey, byte[]>(new CacheLoaderImpl());

    public byte[] generate(String name) {
        return (name == null || name.length() < 1) ? EMPTY : cache.get(of(name.charAt(0), nextColor(name.hashCode())));
    }

}
