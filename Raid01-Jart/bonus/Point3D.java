package bonus;
import java.util.Random;
import geometrical_shapes.*;


public class Point3D {
    public int x;
    public int y;
    public int z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point to2D() {
        double ajust = 0.5;
        int projectedX = (int) (x - (z * ajust));
        int projectedY = (int) (y - (z * ajust));
        return new Point(projectedX, projectedY);
    }
    public static Point3D random(int width, int height) {
        Random random = new Random();
        return new Point3D(random.nextInt(width), random.nextInt(height), random.nextInt(width));   
    } 
}
