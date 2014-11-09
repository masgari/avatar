package app;

import avatar.LetterAvatarGenerator;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @author mamad
 * @since 09/11/14.
 */
public class App {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.out.println("Usage:\n app <name1> <name2> ...");
            return;
        }
        LetterAvatarGenerator generator = new LetterAvatarGenerator();
        for (String aName : args) {
            String name = aName.trim();
            byte[] image = generator.generate(name);
            File out = new File(name + ".png");
            if (!out.exists()) {
                if (!out.createNewFile()) {
                    System.err.println("Could not create image file.");
                    return;
                }
            }
            FileOutputStream fos = new FileOutputStream(out);
            try {
                fos.write(image);
            } finally {
                fos.close();
            }

        }
    }
}
