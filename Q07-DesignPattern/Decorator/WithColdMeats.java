public class WithColdMeats extends RacletteDecorator {
    private Raclette decoratedRaclette;

    public WithColdMeats(Raclette decoratedRaclette){
        super(decoratedRaclette);
    }

    public int getCalories() {
        return 350 + super.getCalories();
    }

    public String getIngredients() {
        return super.getIngredients() + ", charcuterie";
    }

    public String toString() {
        return " " + getIngredients() + " pour " + getCalories() + " calories";
    }
}
