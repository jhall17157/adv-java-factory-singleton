package factory.abstractfactory.meals;

public class Lunch implements Meal {
    private String description;
    private boolean isDelicious;

    public Lunch() {
        description = "Turkey Sandwich";
        isDelicious = true;
    }

    @Override
    public void displayMeal() {
        System.out.println(description + " is " + (isDelicious ? "delicious" : "disgusting"));
    }
}
