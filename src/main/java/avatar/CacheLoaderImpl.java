package avatar;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @author mamad
 * @since 09/11/14.
 */
public class CacheLoaderImpl implements CacheLoader<CacheKey, byte[]> {
    public static final byte[] EMPTY = new byte[0];

    private final Font font;
    private final String format;

    public CacheLoaderImpl() {
        this(new Font(Font.SANS_SERIF, Font.BOLD, 128), "png");
    }

    public CacheLoaderImpl(Font font, String format) {
        this.font = font;
        this.format = format;
    }

    @Override
    public byte[] load(CacheKey key) throws Exception {
        if (key == null) {
            return EMPTY;
        }
        ImageSpec info = new ImageSpec(String.valueOf(key.letter), 256, 256);
        info.rotation = 0;
        info.color = Color.WHITE;
        info.background = key.background;
        info.font = font;
        info.drawInCenter = true;

        BufferedImage image = ImageGenerator.createImage(info);
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try {
            ImageIO.write(image, format, buffer);
        } catch (IOException e) {
            return EMPTY;
        }
        return buffer.toByteArray();
    }
}

