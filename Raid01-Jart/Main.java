import geometrical_shapes.*;
import bonus.*;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        Image image = new Image(1000, 1000);
        
        Line line = new Line(new Point(640, 340), new Point(450, 900));
        line.draw(image);

        Rectangle rectangle = new Rectangle(new Point(50, 50), new Point(300, 200));
        rectangle.draw(image);

        Triangle triangle = new Triangle(new Point(100, 100), new Point(900, 900), new Point(100, 900));
        triangle.draw(image);

        for (int i = 0; i < 50; i++) {
            Circle circle = Circle.random(image.getWidth(), image.getHeight());
            circle.draw(image);
        }

        Cube cube = new Cube(new Point3D(700, 400, 0), 200, Color.GREEN);
        cube.draw(image);


        image.save("image.png");
    }
}