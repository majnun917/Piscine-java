
public class CelestialObject {

    public double x;
    public double y;
    public double z;
    public String name;

    public CelestialObject() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
        this.name = "Soleil";
    }

    public double getX() {return this.x;}
    public double getY() {return this.y;}
    public double getZ() {return this.z;}
    public String getName() {return this.name;}

    public void setX(double  x) { this.x = x; }
    public void setY(double  y) {this.y = y;}
    public void setZ(double  z) {this.z = z;}
    public void setName(String name) {this.name = name;}
}
