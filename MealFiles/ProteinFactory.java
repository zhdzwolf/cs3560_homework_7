package MealFiles;

import java.util.Arrays;
import java.util.List;

public class ProteinFactory {
    private static final ProteinFactory INSTANCE = new ProteinFactory();

    private ProteinFactory() {
    }

    public static ProteinFactory getInstance() {
        return INSTANCE;
    }

    public String createProtein(DietPlan plan) {
        List<String> foods;

        switch (plan) {
            case PALEO:
                foods = Arrays.asList("Fish", "Chicken", "Beef");
                break;
            case VEGAN:
                foods = Arrays.asList("Tofu");
                break;
            case NUT_ALLERGY:
                foods = Arrays.asList("Fish", "Chicken", "Beef", "Tofu");
                break;
            default:
                foods = Arrays.asList("Fish", "Chicken", "Beef", "Tofu");
        }

        return RandomFood.choose(foods);
    }
}
