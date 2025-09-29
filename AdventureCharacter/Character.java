public class Character{
    final int maxHealth;
    public int currentHealth;
    final String name;

    Character(String name, int maxHealth){
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
    }

    public int getMaxHealth(){return this.maxHealth;}
    public int getCurrentHealth(){return this.currentHealth;}
    public String getName(){return this.name;}

    @Override
    public String toString(){
        if (getCurrentHealth() == 0){
            return name + " : KO";
        }
        return name + " : " + getCurrentHealth() + "/" + getMaxHealth();
    }

    public int takeDamage(int amount){
       currentHealth -= amount;
        if (currentHealth < 0) {
            currentHealth = 0;
        }
        return currentHealth;

    }

    public int attack(Character c){
        return c.takeDamage(9);
    }

    // public static void main(String[] args) {
    //     Character aragorn = new Character("Aragorn", 20);
    //     Character uruk = new Character("Uruk", 5);

    //     System.out.println("1|->"+aragorn.toString());
    //     System.out.println("2|->"+uruk.toString());

    //     aragorn.attack(uruk);

    //     System.out.println("3|->"+uruk.toString());

    //     aragorn.takeDamage(12);

    //     System.out.println("4|->"+aragorn.toString());
    // }
}