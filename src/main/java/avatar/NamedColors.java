package avatar;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

/**
 * Java Code to get a color name from rgb/hex value/awt color
 * <p/>
 * The part of looking up a color name from the rgb values is edited from
 * https://gist.github.com/nightlark/6482130#file-gistfile1-java (that has some errors) by Ryan Mast (nightlark)
 *
 * @author Xiaoxiao Li
 */
public enum NamedColors {
    DEFAULT;

    /**
     * Initialize the color list that we have.
     */
    public static final List<NamedColor> NAMED_COLORS = Arrays.asList(
            new NamedColor("AliceBlue", 0xF0, 0xF8, 0xFF),
            new NamedColor("AntiqueWhite", 0xFA, 0xEB, 0xD7),
            new NamedColor("Aqua", 0x00, 0xFF, 0xFF),
            new NamedColor("Aquamarine", 0x7F, 0xFF, 0xD4),
            new NamedColor("Azure", 0xF0, 0xFF, 0xFF),
            new NamedColor("Beige", 0xF5, 0xF5, 0xDC),
            new NamedColor("Bisque", 0xFF, 0xE4, 0xC4),
            new NamedColor("Black", 0x00, 0x00, 0x00),
            new NamedColor("BlanchedAlmond", 0xFF, 0xEB, 0xCD),
            new NamedColor("Blue", 0x00, 0x00, 0xFF),
            new NamedColor("BlueViolet", 0x8A, 0x2B, 0xE2),
            new NamedColor("Brown", 0xA5, 0x2A, 0x2A),
            new NamedColor("BurlyWood", 0xDE, 0xB8, 0x87),
            new NamedColor("CadetBlue", 0x5F, 0x9E, 0xA0),
            new NamedColor("Chartreuse", 0x7F, 0xFF, 0x00),
            new NamedColor("Chocolate", 0xD2, 0x69, 0x1E),
            new NamedColor("Coral", 0xFF, 0x7F, 0x50),
            new NamedColor("CornflowerBlue", 0x64, 0x95, 0xED),
            new NamedColor("Cornsilk", 0xFF, 0xF8, 0xDC),
            new NamedColor("Crimson", 0xDC, 0x14, 0x3C),
            new NamedColor("Cyan", 0x00, 0xFF, 0xFF),
            new NamedColor("DarkBlue", 0x00, 0x00, 0x8B),
            new NamedColor("DarkCyan", 0x00, 0x8B, 0x8B),
            new NamedColor("DarkGoldenRod", 0xB8, 0x86, 0x0B),
            new NamedColor("DarkGray", 0xA9, 0xA9, 0xA9),
            new NamedColor("DarkGreen", 0x00, 0x64, 0x00),
            new NamedColor("DarkKhaki", 0xBD, 0xB7, 0x6B),
            new NamedColor("DarkMagenta", 0x8B, 0x00, 0x8B),
            new NamedColor("DarkOliveGreen", 0x55, 0x6B, 0x2F),
            new NamedColor("DarkOrange", 0xFF, 0x8C, 0x00),
            new NamedColor("DarkOrchid", 0x99, 0x32, 0xCC),
            new NamedColor("DarkRed", 0x8B, 0x00, 0x00),
            new NamedColor("DarkSalmon", 0xE9, 0x96, 0x7A),
            new NamedColor("DarkSeaGreen", 0x8F, 0xBC, 0x8F),
            new NamedColor("DarkSlateBlue", 0x48, 0x3D, 0x8B),
            new NamedColor("DarkSlateGray", 0x2F, 0x4F, 0x4F),
            new NamedColor("DarkTurquoise", 0x00, 0xCE, 0xD1),
            new NamedColor("DarkViolet", 0x94, 0x00, 0xD3),
            new NamedColor("DeepPink", 0xFF, 0x14, 0x93),
            new NamedColor("DeepSkyBlue", 0x00, 0xBF, 0xFF),
            new NamedColor("DimGray", 0x69, 0x69, 0x69),
            new NamedColor("DodgerBlue", 0x1E, 0x90, 0xFF),
            new NamedColor("FireBrick", 0xB2, 0x22, 0x22),
            new NamedColor("FloralWhite", 0xFF, 0xFA, 0xF0),
            new NamedColor("ForestGreen", 0x22, 0x8B, 0x22),
            new NamedColor("Fuchsia", 0xFF, 0x00, 0xFF),
            new NamedColor("Gainsboro", 0xDC, 0xDC, 0xDC),
            new NamedColor("GhostWhite", 0xF8, 0xF8, 0xFF),
            new NamedColor("Gold", 0xFF, 0xD7, 0x00),
            new NamedColor("GoldenRod", 0xDA, 0xA5, 0x20),
            new NamedColor("Gray", 0x80, 0x80, 0x80),
            new NamedColor("Green", 0x00, 0x80, 0x00),
            new NamedColor("GreenYellow", 0xAD, 0xFF, 0x2F),
            new NamedColor("HoneyDew", 0xF0, 0xFF, 0xF0),
            new NamedColor("HotPink", 0xFF, 0x69, 0xB4),
            new NamedColor("IndianRed", 0xCD, 0x5C, 0x5C),
            new NamedColor("Indigo", 0x4B, 0x00, 0x82),
            new NamedColor("Ivory", 0xFF, 0xFF, 0xF0),
            new NamedColor("Khaki", 0xF0, 0xE6, 0x8C),
            new NamedColor("Lavender", 0xE6, 0xE6, 0xFA),
            new NamedColor("LavenderBlush", 0xFF, 0xF0, 0xF5),
            new NamedColor("LawnGreen", 0x7C, 0xFC, 0x00),
            new NamedColor("LemonChiffon", 0xFF, 0xFA, 0xCD),
            new NamedColor("LightBlue", 0xAD, 0xD8, 0xE6),
            new NamedColor("LightCoral", 0xF0, 0x80, 0x80),
            new NamedColor("LightCyan", 0xE0, 0xFF, 0xFF),
            new NamedColor("LightGoldenRodYellow", 0xFA, 0xFA, 0xD2),
            new NamedColor("LightGray", 0xD3, 0xD3, 0xD3),
            new NamedColor("LightGreen", 0x90, 0xEE, 0x90),
            new NamedColor("LightPink", 0xFF, 0xB6, 0xC1),
            new NamedColor("LightSalmon", 0xFF, 0xA0, 0x7A),
            new NamedColor("LightSeaGreen", 0x20, 0xB2, 0xAA),
            new NamedColor("LightSkyBlue", 0x87, 0xCE, 0xFA),
            new NamedColor("LightSlateGray", 0x77, 0x88, 0x99),
            new NamedColor("LightSteelBlue", 0xB0, 0xC4, 0xDE),
            new NamedColor("LightYellow", 0xFF, 0xFF, 0xE0),
            new NamedColor("Lime", 0x00, 0xFF, 0x00),
            new NamedColor("LimeGreen", 0x32, 0xCD, 0x32),
            new NamedColor("Linen", 0xFA, 0xF0, 0xE6),
            new NamedColor("Magenta", 0xFF, 0x00, 0xFF),
            new NamedColor("Maroon", 0x80, 0x00, 0x00),
            new NamedColor("MediumAquaMarine", 0x66, 0xCD, 0xAA),
            new NamedColor("MediumBlue", 0x00, 0x00, 0xCD),
            new NamedColor("MediumOrchid", 0xBA, 0x55, 0xD3),
            new NamedColor("MediumPurple", 0x93, 0x70, 0xDB),
            new NamedColor("MediumSeaGreen", 0x3C, 0xB3, 0x71),
            new NamedColor("MediumSlateBlue", 0x7B, 0x68, 0xEE),
            new NamedColor("MediumSpringGreen", 0x00, 0xFA, 0x9A),
            new NamedColor("MediumTurquoise", 0x48, 0xD1, 0xCC),
            new NamedColor("MediumVioletRed", 0xC7, 0x15, 0x85),
            new NamedColor("MidnightBlue", 0x19, 0x19, 0x70),
            new NamedColor("MintCream", 0xF5, 0xFF, 0xFA),
            new NamedColor("MistyRose", 0xFF, 0xE4, 0xE1),
            new NamedColor("Moccasin", 0xFF, 0xE4, 0xB5),
            new NamedColor("NavajoWhite", 0xFF, 0xDE, 0xAD),
            new NamedColor("Navy", 0x00, 0x00, 0x80),
            new NamedColor("OldLace", 0xFD, 0xF5, 0xE6),
            new NamedColor("Olive", 0x80, 0x80, 0x00),
            new NamedColor("OliveDrab", 0x6B, 0x8E, 0x23),
            new NamedColor("Orange", 0xFF, 0xA5, 0x00),
            new NamedColor("OrangeRed", 0xFF, 0x45, 0x00),
            new NamedColor("Orchid", 0xDA, 0x70, 0xD6),
            new NamedColor("PaleGoldenRod", 0xEE, 0xE8, 0xAA),
            new NamedColor("PaleGreen", 0x98, 0xFB, 0x98),
            new NamedColor("PaleTurquoise", 0xAF, 0xEE, 0xEE),
            new NamedColor("PaleVioletRed", 0xDB, 0x70, 0x93),
            new NamedColor("PapayaWhip", 0xFF, 0xEF, 0xD5),
            new NamedColor("PeachPuff", 0xFF, 0xDA, 0xB9),
            new NamedColor("Peru", 0xCD, 0x85, 0x3F),
            new NamedColor("Pink", 0xFF, 0xC0, 0xCB),
            new NamedColor("Plum", 0xDD, 0xA0, 0xDD),
            new NamedColor("PowderBlue", 0xB0, 0xE0, 0xE6),
            new NamedColor("Purple", 0x80, 0x00, 0x80),
            new NamedColor("Red", 0xFF, 0x00, 0x00),
            new NamedColor("RosyBrown", 0xBC, 0x8F, 0x8F),
            new NamedColor("RoyalBlue", 0x41, 0x69, 0xE1),
            new NamedColor("SaddleBrown", 0x8B, 0x45, 0x13),
            new NamedColor("Salmon", 0xFA, 0x80, 0x72),
            new NamedColor("SandyBrown", 0xF4, 0xA4, 0x60),
            new NamedColor("SeaGreen", 0x2E, 0x8B, 0x57),
            new NamedColor("SeaShell", 0xFF, 0xF5, 0xEE),
            new NamedColor("Sienna", 0xA0, 0x52, 0x2D),
            new NamedColor("Silver", 0xC0, 0xC0, 0xC0),
            new NamedColor("SkyBlue", 0x87, 0xCE, 0xEB),
            new NamedColor("SlateBlue", 0x6A, 0x5A, 0xCD),
            new NamedColor("SlateGray", 0x70, 0x80, 0x90),
            new NamedColor("Snow", 0xFF, 0xFA, 0xFA),
            new NamedColor("SpringGreen", 0x00, 0xFF, 0x7F),
            new NamedColor("SteelBlue", 0x46, 0x82, 0xB4),
            new NamedColor("Tan", 0xD2, 0xB4, 0x8C),
            new NamedColor("Teal", 0x00, 0x80, 0x80),
            new NamedColor("Thistle", 0xD8, 0xBF, 0xD8),
            new NamedColor("Tomato", 0xFF, 0x63, 0x47),
            new NamedColor("Turquoise", 0x40, 0xE0, 0xD0),
            new NamedColor("Violet", 0xEE, 0x82, 0xEE),
            new NamedColor("Wheat", 0xF5, 0xDE, 0xB3),
            new NamedColor("White", 0xFF, 0xFF, 0xFF),
            new NamedColor("WhiteSmoke", 0xF5, 0xF5, 0xF5),
            new NamedColor("Yellow", 0xFF, 0xFF, 0x00),
            new NamedColor("YellowGreen", 0x9A, 0xCD, 0x32)
    );

    /**
     * Get the closest color name from our list
     *
     * @param r red
     * @param g green
     * @param b blue
     * @return name of the color
     */
    public String getColorNameFromRgb(int r, int g, int b) {
        NamedColor closestMatch = null;
        int minMSE = Integer.MAX_VALUE;
        int mse;
        for (NamedColor c : NAMED_COLORS) {
            mse = c.computeMSE(r, g, b);
            if (mse < minMSE) {
                minMSE = mse;
                closestMatch = c;
            }
        }

        if (closestMatch != null) {
            return closestMatch.getName();
        } else {
            return "No matched color name.";
        }
    }

    /**
     * Convert hexColor to rgb, then call getColorNameFromRgb(r, g, b)
     *
     * @param hexColor hex value
     * @return name of the color
     */
    public String getColorNameFromHex(int hexColor) {
        int r = (hexColor & 0xFF0000) >> 16;
        int g = (hexColor & 0xFF00) >> 8;
        int b = (hexColor & 0xFF);
        return getColorNameFromRgb(r, g, b);
    }

    public int colorToHex(Color c) {
        return Integer.decode("0x"
                + Integer.toHexString(c.getRGB()).substring(2));
    }

    public String getColorNameFromColor(Color color) {
        return getColorNameFromRgb(color.getRed(), color.getGreen(),
                color.getBlue());
    }

    /**
     * SubClass of NamedColors. In order to lookup color name
     *
     * @author Xiaoxiao Li
     */
    public static class NamedColor {
        public final int r, g, b;
        public final String name;
        private final Color color;

        public NamedColor(String name, int r, int g, int b) {
            this.r = r;
            this.g = g;
            this.b = b;
            this.name = name;
            this.color = new Color(r, g, b);
        }

        public int computeMSE(int pixR, int pixG, int pixB) {
            return (((pixR - r) * (pixR - r) + (pixG - g) * (pixG - g) + (pixB - b) * (pixB - b)) / 3);
        }

        public int getR() {
            return r;
        }

        public int getG() {
            return g;
        }

        public int getB() {
            return b;
        }

        public String getName() {
            return name;
        }

        public Color getColor() {
            return color;
        }
    }
}
