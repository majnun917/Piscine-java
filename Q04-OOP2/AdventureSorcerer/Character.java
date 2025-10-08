
import java.util.ArrayList;
import java.util.List;

public class Character {
    final private int maxHealth;
    private int currentHealth;
    final private String name;
    private static List<Character> allCharacters = new ArrayList<>();

    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        allCharacters.add(this);
    }

    public int getMaxHealth() {
        return this.maxHealth;
    }

    public int getCurrentHealth() {
        return this.currentHealth;
    }


    public void setCurrentHealth(int maxHealth2) {
       this.currentHealth = maxHealth2;
    }
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        if (getCurrentHealth() == 0) {
            return name + " : KO";
        }
        return name + " : " + getCurrentHealth() + "/" + getMaxHealth();
    }

    public void takeDamage(int amount) {
        this.currentHealth -= amount;
        if (this.currentHealth < 0) {
            this.currentHealth = 0;
        }
        return;
    }

    public void attack(Character c) {
        c.takeDamage(9);
        return;
    }


    public static String printStatus() {
        StringBuilder statusVide = new StringBuilder();
        statusVide.append("------------------------------------------\n");
        statusVide.append("Nobody's fighting right now !" + "\n");
        statusVide.append("------------------------------------------\n");
        if (allCharacters.size() == 0){
            return statusVide.toString();
        }
       
        StringBuilder status = new StringBuilder();
        status.append("------------------------------------------\n");
        status.append("Characters currently fighting :" + "\n");

        for (Character c : allCharacters) {
            status.append(" - " + c.toString() + "\n");
        }
        status.append("------------------------------------------\n");
        return status.toString();
    }

    public static Character fight(Character obj1, Character obj2) {
        Character winner;
        while (obj1.getCurrentHealth() > 0 && obj2.getCurrentHealth() > 0) {
            obj1.attack(obj2);
            obj2.attack(obj1);
        }
        if (obj1.getCurrentHealth() == 0) {
            winner = obj2;
        } else {
            winner = obj1;
        }
        return winner;
    }

}