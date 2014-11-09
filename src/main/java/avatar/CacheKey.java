package avatar;

import java.awt.*;
import java.util.Objects;

/**
 * @author mamad
 * @since 09/11/14.
 */
public class CacheKey {
    public final char letter;
    public final Color background;

    private CacheKey(char letter, Color background) {
        this.letter = letter;
        this.background = background;
    }

    public static CacheKey of(char letter, Color color) {
        return new CacheKey(letter, color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CacheKey)) {
            return false;
        }

        CacheKey cacheKey = (CacheKey) o;

        return Objects.equals(letter, cacheKey.letter) && Objects.equals(background, cacheKey.background);
    }

    @Override
    public int hashCode() {
        int result = (int) letter;
        result = 31 * result + (background != null ? background.hashCode() : 0);
        return result;
    }
}
