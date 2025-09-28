package geometrical_shapes;
import java.awt.Color;
import java.util.Random;

public class Circle implements Drawable {
    private Color color; 
    private int radius; 
    private int x; 
    private int y; 

    public Circle(int x, int y, int radius, Color color) {
        this.color = color;
        this.radius = radius;
        this.x = x;
        this.y = y;
    }


    public void draw(Displayable displayable) {
        int thickness = 1;

        for (int i = -radius; i <= radius; i++) {
            for (int j = -radius; j <= radius; j++) {

                int distanceSquared = i*i + j*j;
                if (distanceSquared >= (radius - thickness)*(radius - thickness) && distanceSquared <= (radius + thickness)*(radius + thickness)) {
                    displayable.display(x + i, y + j, getColor());
                }

            }
        }
    }


    public Color getColor() {
        return color;
    }

    public static Circle random(int width, int height) {
        Random rand = new Random();
        int radius = rand.nextInt(1000);
        int x = rand.nextInt(1000);
        int y = rand.nextInt(1000);
        Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
        return new Circle(x, y, radius, color);
    }
}
