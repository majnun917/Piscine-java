package AdventureException;
public class Monster extends Character {
    public Monster(String name, int maxHealth, Weapon weapon) {
        super(name, maxHealth, weapon);
    }

    @Override
    public String toString() {
        // Monster obj = new Monster(getName(), getMaxHealth());
        // Character o = new Character(getName(), getMaxHealth());
        if (getCurrentHealth() > 0) {
            return getName() + " is a monster with " + this.getCurrentHealth() + " HP."+ " He has the weapon " + getWeapon();
        }
        return getName() + " is a monster and is dead" + " He has the weapon " + getWeapon();
    }

    @Override
    public void takeDamage(int amount) {
        int newHealth = getCurrentHealth() - ((int) (0.8 * amount));
        if (newHealth < 0) {
            newHealth = 0;
        }
        setCurrentHealth(newHealth);
        return;
    }

    @Override
    public void attack(Character c) {
        if (getWeapon() == null){
            c.takeDamage(7);
        } else {
            c.takeDamage(getWeapon().getDamage());
        }
        return;
    }

}
