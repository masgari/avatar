package avatar;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * @author mamad
 * @since 09/11/14.
 */
public class DarkColors {
    public static final Collection<String> DARK_COLOR_NAMES = Collections.unmodifiableCollection(Arrays.asList(
            "DarkBlue", "Black", "Brown", "BlueViolet",
            "DarkMagenta", "DarkGreen", "DarkGray", "CadetBlue", "DarkSlateBlue", "DarkSlateGray",
            "DeepPink", "DarkOliveGreen", "Indigo", "GoldenRod", "FireBrick", "ForestGreen", "Maroon", "Fuchsia",
            "IndianRed", "MediumOrchid", "Navy", "Maroon", "MidnightBlue", "Purple", "OrangeRed", "SaddleBrown",
            "Orchid", "SandyBrown", "Teal", "SeaGreen", "Sienna", "Tomato", "Violet", "YellowGreen",
            "Tan", "Olive", "OliveDrab", "LightSkyBlue", "LightSteelBlue", "LightPink", "PaleVioletRed", "Plum",
            "RoyalBlue"));

    private static final List<Color> DARK_COLORS;

    static {
        List<Color> colors = new ArrayList<Color>(DARK_COLOR_NAMES.size());

        for (NamedColors.NamedColor namedColor : NamedColors.NAMED_COLORS) {
            if (DARK_COLOR_NAMES.contains(namedColor.getName())) {
                colors.add(namedColor.getColor());
            }
        }
        DARK_COLORS = Collections.unmodifiableList(colors);
    }


    public static Color nextColor(int hashCode) {
        return DARK_COLORS.get(Math.abs(hashCode % DARK_COLORS.size()));
    }

}
