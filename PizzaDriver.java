
public class PizzaDriver {

	public static void main(String[] args) {
		// Creating pizzas first 3 pizzas
        Pizza pizza1 = new PizzaBuilder("Small").addPepperoni().addSausage().addCheese().build();
        Pizza pizza2 = new PizzaBuilder("Medium").addSausage().addOnion().addPepper().addChicken().addSpinach().addOlives().build();
        Pizza pizza3 = new PizzaBuilder("Large").addBacon().addOlives().addTomatoBasil().addHam().addPesto().addSpinach().addCheese().addSausage().addPepperoni().build();

        // Eating pizzas
        pizza1.eat("Pizza Hut");
        pizza2.eat("Pizza Hut");
        pizza3.eat("Pizza Hut");

        // Pizza Hut - L3, S2
        Pizza pizzaHut1 = new PizzaBuilder("Medium").addPepperoni().addMushroom().addHamPineapple().build();
        Pizza pizzaHut2 = new PizzaBuilder("Small").addCheese().addTomatoBasil().build();
        
        pizzaHut1.eat("Pizza Hut");
        pizzaHut2.eat("Pizza Hut");
        
        // Little Caesars - M8, S6
        Pizza caesars1 = new PizzaBuilder("Medium").addPepperoni().addOnion().addBeef().addChicken().addOlives().addTomatoBasil().addBacon().addSpinach().build();
        Pizza caesars2 = new PizzaBuilder("Small").addMushroom().addOnion().addPepper().addPork().addHam().addBacon().build();
        
        caesars1.eat("Little Caesars");
        caesars2.eat("Little Caesars");

        // Dominos S1, L3
        Pizza dominos1 = new PizzaBuilder("Small").addPepperoni().build();
        Pizza dominos2 = new PizzaBuilder("Large").addPesto().addMushroom().addSausage().build();
        
        dominos1.eat("Dominos");
        dominos2.eat("Dominos");
	}

}
