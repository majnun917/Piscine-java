public class Planet extends CelestialObject {
    private Star centerStar;

    public Planet() {
        this.centerStar = new Star();
    }

    public Planet(String name, double x, double y, double z, Star centerStar) {
        super(name, x, y, z);
        this.centerStar = centerStar;
    }

    public Star getCenterStar() {
        return centerStar;
    }

    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
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
        } if (this.centerStar != other.centerStar){
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
        hash = 31 * hash + (this.centerStar != null ? this.centerStar.hashCode() : 0);
        hash = 31 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString(){
        double d = CelestialObject.getDistanceBetween(this, centerStar);
        return String.format("%s circles around %s at the %.3f AU",this.name, centerStar.name, d);
    }
}