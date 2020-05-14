package factory.abstractfactory.meals;

public class Dinner implements Meal {
    private String description;
    private boolean isDelicious;

    public Dinner() {
        description = "Steak";
        isDelicious = true;
    }

    @Override
    public void displayMeal() {
        System.out.println(description + " is " + (isDelicious ? "delicious" : "disgusting"));
    }
}
