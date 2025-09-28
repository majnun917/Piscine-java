package geometrical_shapes;
import java.awt.Color;


public class Rectangle implements Drawable {
    private Point a;
    private Point b;
    private Color color;

    public Rectangle(Point a, Point b) {
        this.a = a;
        this.b = b;
        this.color = Color.GREEN;
    }

    public void draw(Displayable displayable) {
      // on met les lines dans un tableau et le parcourir 
      // pour eviter la redondance dans la 1ere methode.
      Line[] lines = new Line[]{
        new Line(a, new Point(a.getX(), b.getY())),
        new Line(a, new Point(b.getX(), a.getY())),
        new Line(b, new Point(b.getX(), a.getY())),
        new Line(b, new Point(a.getX(), b.getY()))
      };
      for(Line line : lines){
        line.setColor(this.color);
        line.draw(displayable);
      }
      //  Line l1 = new Line(a, new Point(a.getX(), b.getY()));
      //  Line l2 = new Line(a, new Point(b.getX(), a.getY()));
      //  Line l3 = new Line(b, new Point(b.getX(), a.getY()));
      //  Line l4 = new Line(b, new Point(a.getX(), b.getY()));
      
      //  l1.setColor(color);
      //  l2.setColor(color);
      //  l3.setColor(color);
      //  l4.setColor(color);
      //  l1.draw(displayable);
      //  l2.draw(displayable);
      //  l3.draw(displayable);
      //  l4.draw(displayable);
    }

    @Override
    public Color getColor() {
      return color;
    }

      public void setColor(Color newColor) {
        this.color = newColor;
    }
}
