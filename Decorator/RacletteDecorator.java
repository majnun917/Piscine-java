public abstract class RacletteDecorator implements Raclette {
    private Raclette raclette;

    public RacletteDecorator(Raclette raclette) {
        this.raclette = raclette;
    }

    public int getCalories() {
        return this.raclette.getCalories();
    }

    public String getIngredients() {
        return this.raclette.getIngredients();
    }

    public String toString() {
        return " " + this.raclette.getIngredients() + " pour " + this.raclette.getCalories() + " calories";
    }
}