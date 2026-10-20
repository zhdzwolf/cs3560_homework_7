package MealFiles;

public class Meal {
    private final String carbs;
    private final String protein;
    private final String fats;

    public Meal(String carbs, String protein, String fats) {
        this.carbs = carbs;
        this.protein = protein;
        this.fats = fats;
    }

    public void print(Customer customer) {
        System.out.println("Name: " + customer.getName());
        System.out.println("Diet Plan: " + customer.getDietPlan());
        System.out.println("Carbs: " + carbs);
        System.out.println("Protein: " + protein);
        System.out.println("Fats: " + fats);
        System.out.println("--------------");
    }
}
