public class CelestialObject{
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
 
    @Override
    public String toString(){
        return this.name + " is positioned at " + "(" + this.x+"00" +", " + this.y +"00" +", "  + this.z+"00" + ")";
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
        if (this.name.equals(other.name)){
            return true;
        }
        return true;
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