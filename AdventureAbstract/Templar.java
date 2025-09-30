

public class Templar extends Character implements Healer, Tank {
    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield) {
        super(name, maxHealth);
        this.healCapacity = healCapacity;
        this.shield = shield;
    }

    @Override
    public int getHealCapacity(){return this.healCapacity;}

    @Override
    public void heal(Character hc) {
        int ch = hc.getCurrentHealth();
        ch += healCapacity;
        if (ch > hc.getMaxHealth()) {
            ch = hc.getMaxHealth();
        }
        hc.setCurrentHealth(ch);
        return;
    }

    @Override
    public int getShield(){return this.shield;}

    @Override
    public void takeDamage(int amount) {
        amount -= this.shield;
        return;
    }
    
    @Override
    public void attack(Character c) {
        heal(c);
        c.takeDamage(6);
        return;
    }

    @Override
    public String toString(){
        if (getCurrentHealth() == 0){
            return getName() + " has been beaten, even with its " + getShield() + " shield. So bad, it could heal " + getHealCapacity() + " HP.";
        }
        return getName() + " is a strong Templar with " + getCurrentHealth() + " HP. It can heal " + getHealCapacity() + " HP and has a shield of " + getShield() + "."; 
    }
}