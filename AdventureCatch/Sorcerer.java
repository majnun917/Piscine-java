
public class Sorcerer extends Character implements Healer {
    final private int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
    }

    @Override
    public int getHealCapacity() {
        return healCapacity;
    }

    @Override
    public void heal(Character hc) throws DeadCharacterException {
        if (hc.getCurrentHealth() == 0) {
            throw new DeadCharacterException(hc);
        }
        int newHealth = hc.getCurrentHealth() + healCapacity;
        if (newHealth > hc.getMaxHealth()) {
            newHealth = hc.getMaxHealth();
        }
        hc.setCurrentHealth(newHealth);
    }

    public void takeDamage(int amount) throws DeadCharacterException {
        if (getCurrentHealth() == 0)
            throw new DeadCharacterException(this);
        int newHealth = getCurrentHealth() - amount;
        if (newHealth < 0) {
            newHealth = 0;
        }
        setCurrentHealth(newHealth);
        return;
    }

    @Override
    public void attack(Character c) throws DeadCharacterException {
        if (getCurrentHealth() == 0) throw new DeadCharacterException(this);
        this.heal(this);
        if (getWeapon() == null) {
            c.takeDamage(10);
        } else {
            c.takeDamage(getWeapon().getDamage());
        }
        return;
    }
    @Override
    public String toString() {
        if (getCurrentHealth() == 0) {
            return getName() + " is a dead sorcerer. So bad, it could heal " + getHealCapacity() + " HP."
                    + " He has the weapon " + getWeapon();
        }
        return getName() + " is a sorcerer with " + getCurrentHealth() + " HP. " + "It can heal " + getHealCapacity()
                + " HP." + " He has the weapon " + getWeapon();
    }
}