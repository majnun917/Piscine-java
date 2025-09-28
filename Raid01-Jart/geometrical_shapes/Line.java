package geometrical_shapes;
import java.awt.Color;

public class Line implements Drawable {
    public Point p1;
    public Point p2;
    public Color color;

    public Line(Point point1, Point point2) {
        p1 = point1;
        p2 = point2;
        color = Color.WHITE; // JE DOIX LE CHANGER !!
    }

    public Point getP1() {
        return p1;
    }  

    public Point getP2() {
        return p2;
    }

    @Override
    public Color getColor() {
        return color;
    }   

    public void setColor(Color color) {
        this.color = color;
    } 
    public static Line random(int width, int height) {
        return new Line(Point.random(width, height), Point.random(width, height));
    }

    @Override
    public void draw(Displayable displayable) {
    int x1 = p1.getX();
    int y1 = p1.getY();
    int x2 = p2.getX();
    int y2 = p2.getY();
    
    int dx = x2 - x1;
    int dy = y2 - y1;
    int step = Math.max(Math.abs(dx), Math.abs(dy));
    
    float ix = dx / (float) step;
    float iy = dy / (float) step;
    
    // Draw points
    float x = x1;
    float y = y1;
    
    for (int i = 0; i <= step; i++) {
        displayable.display(Math.round(x), Math.round(y), color);
        x += ix;
        y += iy;
    }
}
}