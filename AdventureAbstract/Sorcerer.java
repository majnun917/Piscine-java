public class Sorcerer extends Character implements Healer {
    final private int healCapacity;

    public Sorcerer(String name, int maxHealth,  int healCapacity){
        super(name, maxHealth);
        this.healCapacity = healCapacity;
    }

    @Override
    public int getHealCapacity(){return healCapacity;}

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
    public void takeDamage(int amount) {
        takeDamage(amount);
        return;
    }
    
    @Override
    public void attack(Character c) {
        heal(c);
        c.takeDamage(10);
        return;
    }

   @Override
   public String toString() {
       if (getCurrentHealth() == 0) {
           return getName() + " is a dead sorcerer. So bad, it could heal "+ getHealCapacity()+" HP.";
       }
       return getName() + " is a sorcerer with " + getCurrentHealth()+ " HP. " + "It can heal "+ getHealCapacity()+" HP.";
   }
}