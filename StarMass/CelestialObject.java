public class CelestialObject{

     public static final  int KM_IN_ONE_AU = (int)1.5E8;
     
    public double x;
    public double y;
    public double z;
    public String name;
    private int mass;

    public CelestialObject() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
        this.name = "Soleil";
    }

    public CelestialObject(String name,double x,double y,double z, int mass){
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
        this.mass = mass;
    }

    public double getX() {return this.x;}
    public double getY() {return this.y;}
    public double getZ() {return this.z;}
    public String getName() {return this.name;}
    public int getMass() {return this.mass;}


    public void setX(double  x) { this.x = x; }
    public void setY(double  y) {this.y = y;}
    public void setZ(double  z) {this.z = z;}
    public void setName(String name) {this.name = name;}
    public void setMass(int mass) {this.mass = mass;}


     public static double getDistanceBetween(CelestialObject obj1, CelestialObject obj2){
        double distance = Math.sqrt(Math.pow(obj1.x - obj2.x, 2) + Math.pow(obj1.y - obj2.y, 2) + Math.pow(obj1.z - obj2.z, 2));
        return distance;
    }

    public static double getDistanceBetweenInKm(CelestialObject obj1, CelestialObject obj2){
        return getDistanceBetween(obj1, obj2) * KM_IN_ONE_AU;
    }
 
    @Override
    public String toString(){
        return String.format("%s is positioned at (%.3f, %.3f, %.3f)", this.name, this.x, this.y, this.z);
    }


    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (this.getClass() != obj.getClass()){
            return false;
        }
        CelestialObject other = (CelestialObject) obj;
        if (this.x != other.x){
            return false;
        }
        if (this.y != other.y){
            return false;
        }
        if (this.z != other.z){
            return false;
        }
        return this.name.equals(other.name);
    }
    
    @Override
    public int hashCode(){
        int hash = 7;
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.x) ^ (Double.doubleToLongBits(this.x) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.y) ^ (Double.doubleToLongBits(this.y) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.z) ^ (Double.doubleToLongBits(this.z) >>> 32));
        hash = 31 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }
}