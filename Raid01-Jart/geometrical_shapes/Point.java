package geometrical_shapes;
import java.awt.Color;
import java.util.Random;


public class Point implements Drawable {
    public int x;
    public int y;
    public Color color;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = Color.RED;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public Color getColor() {
        return color;
    }   

    public static Point random(int width, int height) {
        Random random = new Random();
        return new Point(random.nextInt(width), random.nextInt(height));
    }

    // @Override
    public void draw(Displayable displayable) {
        displayable.display(x, y, color);
    }
}