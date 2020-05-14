package factory.abstractfactory.meals;

public class Breakfast implements Meal {
    private String description;
    private boolean isDelicious;

    public Breakfast() {
        description = "Eggs Benedict";
        isDelicious = true;
    }

    @Override
    public void displayMeal() {
        System.out.println(description + " is " + (isDelicious ? "delicious" : "disgusting"));
    }
}
