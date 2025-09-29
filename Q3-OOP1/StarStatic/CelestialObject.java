
public class CelestialObject {

    public static final  int KM_IN_ONE_AU = (int)1.5E8;

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

    public CelestialObject(String name,double x,double y,double z){
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {return this.x;}
    public double getY() {return this.y;}
    public double getZ() {return this.z;}
    public String getName() {return this.name;}

    public void setX(double  x) { this.x = x; }
    public void setY(double  y) {this.y = y;}
    public void setZ(double  z) {this.z = z;}
    public void setName(String name) {this.name = name;}

    public static double getDistanceBetween(CelestialObject obj1, CelestialObject obj2){
        double distance = Math.sqrt(Math.pow(obj1.x - obj2.x, 2) + Math.pow(obj1.y - obj2.y, 2) + Math.pow(obj1.z - obj2.z, 2));
        return distance;
    }

    public static double getDistanceBetweenInKm(CelestialObject obj1, CelestialObject obj2){
        return getDistanceBetween(obj1, obj2) * KM_IN_ONE_AU;
    }
}
