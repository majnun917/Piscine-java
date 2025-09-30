package AdventureException;
public class Weapon {
    private final String name;
    private final int damage;

    public String getName(){return this.name;}
    public int getDamage(){return this.damage;}
    
    public Weapon(String name, int damage){
        this.name = name;
        this.damage = damage;
    }

    @Override
    public String toString(){
        return getName() + " deals " + getDamage() + " damages";
    }
}
