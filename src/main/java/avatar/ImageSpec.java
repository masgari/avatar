package avatar;

import java.awt.*;
import java.io.Serializable;

/**
 * @author mamad
 * @since 09/11/14.
 */
public class ImageSpec implements Serializable {
    private static final Color TRANSPARENT = new Color(0, 0, 0, 0);
    private static final long serialVersionUID = 1L;
    public int width;
    public int height;
    public String text;
    public Color color = Color.WHITE;
    public Color background = TRANSPARENT;
    public double rotation = Math.PI / 2.0;
    public boolean drawInCenter = false;
    public Font font;

    public ImageSpec(String text, int width, int height) {
        this.text = text;
        this.width = width;
        this.height = height;
    }
}
