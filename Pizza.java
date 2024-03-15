import java.util.ArrayList;
import java.util.List;

enum Topping {
    PEPPERONI, SAUSAGE, MUSHROOMS, BACON, ONIONS, EXTRA_CHEESE, PEPPERS, CHICKEN,
    OLIVES, SPINACH, TOMATO_AND_BASIL, BEEF, HAM, PESTO, SPICY_PORK, HAM_AND_PINEAPPLE
}

public class Pizza {
	private String size;
    private List<Topping> toppings;

    public Pizza(String size) {
        this.size = size;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public void eat(String chain) {
        System.out.println(chain + "\nSize: " + size);
        System.out.print("Toppings: ");
        for (Topping topping : toppings) {
            System.out.print(topping + " - ");
        }
        System.out.println();
    }
}
