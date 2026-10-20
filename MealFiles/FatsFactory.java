package MealFiles;

import java.util.Arrays;
import java.util.List;

public class FatsFactory {
    private static final FatsFactory INSTANCE = new FatsFactory();

    private FatsFactory() {
    }

    public static FatsFactory getInstance() {
        return INSTANCE;
    }

    public String createFats(DietPlan plan) {
        List<String> foods;

        switch (plan) {
            case PALEO:
                foods = Arrays.asList("Avocado", "Tuna", "Peanuts");
                break;
            case VEGAN:
                foods = Arrays.asList("Avocado", "Peanuts");
                break;
            case NUT_ALLERGY:
                foods = Arrays.asList("Avocado", "Sour Cream", "Tuna");
                break;
            default:
                foods = Arrays.asList("Avocado", "Sour Cream", "Tuna", "Peanuts");
        }

        return RandomFood.choose(foods);
    }
}
