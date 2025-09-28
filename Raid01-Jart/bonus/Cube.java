package bonus;
import geometrical_shapes.*;
import java.awt.Color;

public class Cube implements Drawable{
    private Point3D p1;
    private int size;
    private Color color;

    public Cube(Point3D p1, int size, Color color) {
        this.p1 = p1;
        this.size = size;
        this.color = Color.RED;
    }

    @Override
    public void draw(Displayable displayable) {

        //on met les points et les lines dans un tableau pour eviter la redondance
        Point3D[] points = new Point3D[]{
            new Point3D(p1.x, p1.y, p1.z),
            new Point3D(p1.x + size, p1.y, p1.z),
            new Point3D(p1.x + size, p1.y + size, p1.z),
            new Point3D(p1.x, p1.y + size, p1.z),
            new Point3D(p1.x, p1.y, p1.z + size),
            new Point3D(p1.x + size, p1.y, p1.z + size),
            new Point3D(p1.x + size, p1.y + size, p1.z + size),
            new Point3D(p1.x, p1.y + size, p1.z + size),  
        };

        int[][] lines = new int[][]{
            {0,1}, {1,2}, {2,3}, {3,0},
            {4,5}, {5,6}, {6,7}, {7,4},
            {0,4}, {1,5}, {2,6}, {3,7}  
        };

        for(int[] line : lines){
            Point3D p1 = points[line[0]];
            Point3D p2 = points[line[1]];
            Line l = new Line(p1.to2D(), p2.to2D());
            l.setColor(this.color);
            l.draw(displayable);
        }
        // front face
        // Point3D p2 = new Point3D(p1.x + size, p1.y, p1.z);
        // Point3D p3 = new Point3D(p1.x + size, p1.y + size, p1.z);
        // Point3D p4 = new Point3D(p1.x, p1.y + size, p1.z);

        // // back face
        // Point3D p5 = new Point3D(p1.x, p1.y, p1.z + size);
        // Point3D p6 = new Point3D(p1.x + size, p1.y, p1.z + size);
        // Point3D p7 = new Point3D(p1.x + size, p1.y + size, p1.z + size);
        // Point3D p8 = new Point3D(p1.x, p1.y + size, p1.z + size);

        // // front face lines
        // Line fl1 = new Line(p1.to2D(), p2.to2D());
        // Line fl2 = new Line(p2.to2D(), p3.to2D());
        // Line fl3 = new Line(p3.to2D(), p4.to2D());
        // Line fl4 = new Line(p4.to2D(), p1.to2D());

        // fl1.setColor(this.color);
        // fl2.setColor(this.color);
        // fl3.setColor(this.color);
        // fl4.setColor(this.color);
        // fl1.draw(displayable);
        // fl2.draw(displayable);
        // fl3.draw(displayable);
        // fl4.draw(displayable);

        // // back face lines
        // Line bfl1 = new Line(p5.to2D(), p6.to2D());
        // Line bfl2 = new Line(p6.to2D(), p7.to2D());
        // Line bfl3 = new Line(p7.to2D(), p8.to2D());
        // Line bfl4 = new Line(p8.to2D(), p5.to2D());

        // bfl1.setColor(this.color);
        // bfl1.draw(displayable);
        // bfl2.setColor(this.color);
        // bfl3.setColor(this.color);
        // bfl4.setColor(this.color);
        // bfl2.draw(displayable);
        // bfl3.draw(displayable);
        // bfl4.draw(displayable);

        // // Sides
        // Line sl1 = new Line(p1.to2D(), p5.to2D());
        // Line sl2 = new Line(p2.to2D(), p6.to2D());
        // Line sl3 =  new Line(p3.to2D(), p7.to2D());
        // Line sl4 = new Line(p4.to2D(), p8.to2D());

        // sl1.setColor(this.color);
        // sl2.setColor(this.color);
        // sl3.setColor(this.color);
        // sl4.setColor(this.color);
        // sl1.draw(displayable);
        // sl2.draw(displayable);
        // sl3.draw(displayable);
        // sl4.draw(displayable);
    }

    @Override
    public Color getColor() {
        return color;
    }

      public void setColor(Color newColor) {
        this.color = newColor;
    }
}
