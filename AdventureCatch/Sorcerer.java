
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
        try {
            int ch = hc.getCurrentHealth();
            ch += healCapacity;
            if (ch > hc.getMaxHealth()) {
                ch = hc.getMaxHealth();
            }
            hc.setCurrentHealth(ch);
            if (hc.getCurrentHealth() == 0) throw new DeadCharacterException(hc);
        } catch (Exception e) {
            throw e;
        }
        return;
    }

    public void takeDamage(int amount) throws DeadCharacterException {
        if (getCurrentHealth() == 0) throw new DeadCharacterException(this);
        int newHealth = getCurrentHealth() - amount;
        if (newHealth < 0) {
            newHealth = 0;
        }
        setCurrentHealth(newHealth);
        return;
    }

    @Override
    public void attack(Character c) throws DeadCharacterException {
        this.heal(this);
        if (getCurrentHealth() == 0) throw new DeadCharacterException(this);
       try {
        if (getWeapon() == null) {
            c.takeDamage(10);
        } else {
            c.takeDamage(getWeapon().getDamage());
        }
       } catch (DeadCharacterException e) {
        throw e;
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