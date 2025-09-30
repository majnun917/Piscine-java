
public class Templar extends Character implements Healer, Tank {
    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
        this.shield = shield;
    }

    @Override
    public int getHealCapacity() {
        return this.healCapacity;
    }

    public void heal(Character hc) throws DeadCharacterException {
        int ch = hc.getCurrentHealth();
        ch += healCapacity;
        if (ch > hc.getMaxHealth()) {
            ch = hc.getMaxHealth();
        }
        hc.setCurrentHealth(ch);
        return;
    }

    @Override
    public int getShield() {
        return this.shield;
    }

    @Override
    public void takeDamage(int amount) throws DeadCharacterException {
        int newHealth = getCurrentHealth() - amount;
        newHealth += this.shield;
        if (newHealth < 0) {
            newHealth = 0;
        }
        setCurrentHealth(newHealth);
    }

    @Override
    public void attack(Character c) throws DeadCharacterException {
        this.heal(this);
        try {
            if (getWeapon() == null) {
                c.takeDamage(6);
            } else {
                c.takeDamage(getWeapon().getDamage());
            }
        } catch (DeadCharacterException e) {
            throw new DeadCharacterException(this);
        }
    }

    @Override
    public String toString() {
        if (getCurrentHealth() == 0) {
            return getName() + " has been beaten, even with its " + getShield() + " shield. So bad, it could heal "
                    + getHealCapacity() + " HP." + " He has the weapon " + getWeapon();
        }
        return getName() + " is a strong Templar with " + getCurrentHealth() + " HP. It can heal " + getHealCapacity()
                + " HP and has a shield of " + getShield() + "." + " He has the weapon " + getWeapon();
    }
}