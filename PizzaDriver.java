import PizzaFiles.Pizza;
import PizzaFiles.PizzaBuilder;

public class PizzaDriver {
    public static void main(String[] args) {
        Pizza yourPizza = new PizzaBuilder()
                .chooseChain("Dominos")
                .setSize("Small")
                .addTopping("Pepperoni")
                .addTopping("Ham")
                .addTopping("Extra Cheese")
                .build();
        yourPizza.eat();

        Pizza thePizza = new PizzaBuilder()
                .chooseChain("Little Caesars")
                .setSize("Medium")
                .addTopping("Sausage")
                .addTopping("Bacon")
                .addTopping("Onions")
                .addTopping("Peppers")
                .addTopping("Olives")
                .addTopping("Ham")
                .build();
        thePizza.eat();

        Pizza myPizza = new PizzaBuilder()
                .chooseChain("Pizza Hut")
                .setSize("Large")
                .addTopping("Pepperoni")
                .addTopping("Sausage")
                .addTopping("Ham")
                .addTopping("Bacon")
                .addTopping("Beef")
                .addTopping("Spicy Pork")
                .addTopping("Ham and Pineapple")
                .addTopping("Peppers")
                .addTopping("Extra Cheese")
                .build();
        myPizza.eat();
    }
}
