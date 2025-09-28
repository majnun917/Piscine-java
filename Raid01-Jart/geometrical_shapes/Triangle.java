package geometrical_shapes;
import java.awt.Color;

public class Triangle implements Drawable {
    private Point a;
    private Point b;
    private Point c;
    private Color color;


    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = Color.YELLOW;
    }

    public void draw(Displayable displayable) {

        Line[] lines = new Line[]{
            new Line(a, b),
            new Line(b, c),
            new Line(a, c)
        };
        for(Line line : lines){
            line.setColor(this.color);
            line.draw(displayable);
        }
        // Line l1 = new Line(a, b);
        // Line l2 = new Line(b, c);
        // Line l3 = new Line(a, c);
            
        // l1.setColor(color);
        // l2.setColor(color);
        // l3.setColor(color);
        // l1.draw(displayable);
        // l2.draw(displayable);
        // l3.draw(displayable);
    }

    @Override
    public Color getColor() {
        return color;
    }
}