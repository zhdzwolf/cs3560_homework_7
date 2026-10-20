import MealFiles.*;

public class MealDriver {
    public static void main(String[] args) {

        Customer[] customers = {
                new Customer("Barbarian", DietPlan.NO_RESTRICTION),
                new Customer("Crusader", DietPlan.PALEO),
                new Customer("Demon Hunter", DietPlan.NUT_ALLERGY),
                new Customer("Monk", DietPlan.VEGAN),
                new Customer("Wizard", DietPlan.NO_RESTRICTION),
                new Customer("Witch Doctor", DietPlan.PALEO),
        };

        MealFactory factory = MealFactory.getInstance();

        for (Customer customer : customers) {
            Meal meal = factory.createMeal(customer);
            meal.print(customer);
        }

    }
}
