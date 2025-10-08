public class WithPickles extends RacletteDecorator {
    private Raclette raclette;

    public WithPickles(Raclette raclette){
         super(raclette);
    }

    public int getCalories() {
        return 50 + super.getCalories();
    }

    public String getIngredients() {
        return super.getIngredients() + ", cornichons";
    }

    public String toString() {
        return " " + getIngredients() + " pour " + getCalories() + " calories";
    }
}