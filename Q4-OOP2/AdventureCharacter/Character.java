public class Character{
    final private int maxHealth;
    private int currentHealth;
    final private String name;

    public Character(String name, int maxHealth){
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

    public void takeDamage(int amount){
        this.currentHealth -= amount;
        if (this.currentHealth < 0){
            this.currentHealth = 0;
        }
        return;
    }

    public void attack(Character c){
        c.takeDamage(9);
        return;
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