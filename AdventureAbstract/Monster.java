public class Monster extends Character {
    public Monster(String name, int maxHealth){
        super(name, maxHealth);
    }

    @Override
    public String toString(){
        //Monster obj = new Monster(getName(), getMaxHealth());
        //Character o = new Character(getName(), getMaxHealth());
        if (this.getCurrentHealth() > 0){
            return getName() + " is a monster with " + this.getCurrentHealth() + " HP";
        }
        return getName() + " is a monster and is dead";
    }

    @Override
    public void takeDamage(int amount) {
       int ad = (int) 0.8 * amount;
       takeDamage(ad);
        return;
    }
    
    @Override
    public void attack(Character c) {
        c.takeDamage(7);
        return;
    }

}
