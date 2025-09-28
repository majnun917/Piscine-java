package geometrical_shapes;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;


public class Image implements Displayable {
    private int width;
    private int height;
    public BufferedImage bufferedImage;

    public Image(int width, int height) {
        this.width = width;
        this.height = height;
        this.bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                bufferedImage.setRGB(x, y, Color.BLACK.getRGB());
            }
        }
    }

    @Override
    public void display(int x, int y, Color color) {
        if (x >= 0 && x < width && y >= 0 && y < height) {
            bufferedImage.setRGB(x, y, color.getRGB());
        }
    }

    @Override
    public void save(String filename) {
        try {
            ImageIO.write(bufferedImage, "png", new File(filename));
            System.out.println("✅ Saved: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getWidth() { return width; }
    public int getHeight() { return height; }
}
