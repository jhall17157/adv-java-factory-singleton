package factory.abstractfactory.meals;




public class MealDriver {

    public static void main(String[] args) {
        LabMealFactory mealFactory = new LabMealFactory();
        Hotel hotel = new Hotel(mealFactory);
        hotel.serveMeals();
    }
}
