
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

    public double setX(double x) { return this.x = x; }
    public double setY(double y) {return this.y = y;}
    public double setZ(double z) {return this.z = z;}
    public String setName(String name) {return this.name = name;}
}
