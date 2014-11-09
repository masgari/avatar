package avatar;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author mamad
 * @since 09/11/14.
 */
public class LetterAvatarGeneratorTest {
    /**
     * png header bytes.
     */
    static final int HEADER[] = {137, 80, 78, 71, 13, 10, 26, 10};

    @Test
    public void testGenerateColor() throws Exception {
        LetterAvatarGenerator generator = new LetterAvatarGenerator();
        byte[] me = generator.generate("Me");
        verify(me);
        byte[] you = generator.generate("You");
        verify(you);
    }

    private void verify(byte[] image) {
        Assert.assertNotNull(image);
        Assert.assertFalse(image.length < HEADER.length);
        for (int i = 0; i < HEADER.length; i++) {
            Assert.assertEquals(HEADER[i], image[i] & 0xFF);
        }
    }
}
