package MealFiles;

import java.util.List;
import java.util.Random;

public class RandomFood {
    private static final Random RANDOM = new Random();

    private RandomFood() {
    }

    public static String choose(List<String> foods) {
        if  (foods.isEmpty()) {
            throw new IllegalArgumentException(
                    "No foods provided"
            );
        }

        return foods.get(RANDOM.nextInt(foods.size()));
    }
}
