package MealFiles;

public class MealFactory {
    private static final MealFactory INSTANCE = new MealFactory();

    private final CarbsFactory carbsFactory;
    private final ProteinFactory proteinFactory;
    private final FatsFactory fatsFactory;

    private MealFactory() {
        carbsFactory = CarbsFactory.getInstance();
        proteinFactory = ProteinFactory.getInstance();
        fatsFactory = FatsFactory.getInstance();
    }

    public static MealFactory getInstance() {
        return INSTANCE;
    }

    public Meal createMeal(Customer customer) {
        DietPlan plan = customer.getDietPlan();

        String carbs = carbsFactory.createCarbs(plan);
        String protein = proteinFactory.createProtein(plan);
        String fats = fatsFactory.createFats(plan);

        return new Meal(carbs, protein, fats);
    }
}
