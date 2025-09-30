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
        int newHealth = getCurrentHealth() - amount;
        if (newHealth < 0) {
            newHealth = 0;
        }
        setCurrentHealth(newHealth);
        return;
    }

    @Override
    public void attack(Character c) {
        this.heal(this);
        if (getWeapon() == null) {
            c.takeDamage(7);
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