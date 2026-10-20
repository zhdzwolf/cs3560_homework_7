package MealFiles;

import java.util.Arrays;
import java.util.List;

public class CarbsFactory {
    private static final CarbsFactory INSTANCE = new CarbsFactory();

    private CarbsFactory() {
    }

    public static CarbsFactory getInstance() {
        return INSTANCE;
    }

    public String createCarbs(DietPlan plan) {
        List<String> foods;

        switch (plan) {
            case PALEO:
                foods = Arrays.asList("Pistachio");
                break;
            case VEGAN:
                foods = Arrays.asList("Bread", "Lentils", "Pistachio");
                break;
            case NUT_ALLERGY:
                foods = Arrays.asList("Cheese", "Bread", "Lentils");
                break;
            default:
                foods = Arrays.asList("Cheese", "Bread", "Lentils", "Pistachio");
        }

        return RandomFood.choose(foods);
    }
}
