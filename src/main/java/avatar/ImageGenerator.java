package avatar;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;


/**
 * @author mamad
 * @since 09/11/14.
 */
public class ImageGenerator {

    public static BufferedImage createImage(ImageSpec spec) {
        BufferedImage image = new BufferedImage(spec.width, spec.height, BufferedImage.BITMASK);
        Graphics2D g2 = image.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2.setBackground(spec.background);
        g2.clearRect(0, 0, spec.width, spec.height);
        if (spec.font != null) {
            g2.setFont(spec.font);
        }
        FontMetrics fm = g2.getFontMetrics();
        int fh = fm.getHeight();
        Rectangle2D.Double area = new Rectangle2D.Double(0, 0, spec.width, spec.height);
        g2.setColor(spec.color);
        if (spec.rotation != 0) {
            AffineTransform at = new AffineTransform();
            at.setToRotation(spec.rotation);
            g2.setTransform(at);
        }
        if (spec.drawInCenter) {
            Rectangle2D strBounds = fm.getStringBounds(spec.text, g2);
            double x = (area.getWidth() - (int) strBounds.getWidth()) / 2;
            double y = (area.getHeight() - (int) strBounds.getHeight()) / 2 + fm.getAscent();
            g2.drawString(spec.text, (float) x, (float) y);
        } else {
            g2.drawString(spec.text, 2, -(float) ((area.getWidth() - fh) / 2) - fm.getDescent());
        }

        g2.dispose();
        return image;
    }

}
