public class Star extends CelestialObject {
    private double magnitude;

    public double  getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        
        this.magnitude = magnitude;
    }

     public Star() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
        this.name = "Soleil";
        this.magnitude = 0.0;
    }


    public Star(String name,double x,double y,double z,double magnitude){
        super(name, x, y, z);
        this.magnitude = magnitude;
    }

    @Override
    public String toString(){
        return String.format("%s shines at the (%.3f) magnitude",this.name, this.magnitude);
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
        Star other = (Star) obj;
        if (this.x != other.x){
            return false;
        }
        if (this.y != other.y){
            return false;
        }
        if (this.z != other.z){
            return false;
        } if (this.magnitude != other.magnitude){
            return false;
        }
        return !this.name.equals(other.name);
    }
    
    @Override
    public int hashCode(){
        int hash = 7;
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.x) ^ (Double.doubleToLongBits(this.x) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.y) ^ (Double.doubleToLongBits(this.y) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.z) ^ (Double.doubleToLongBits(this.z) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.magnitude) ^ (Double.doubleToLongBits(this.magnitude) >>> 32));
        hash = 31 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }

}