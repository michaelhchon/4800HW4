public class PizzaBuilder {
	private Pizza pizza;

    public PizzaBuilder(String size) {
        this.pizza = new Pizza(size);
    }

    public PizzaBuilder addPepperoni() {
        pizza.addTopping(Topping.PEPPERONI);
        return this;
    }

    public PizzaBuilder addSausage() {
        pizza.addTopping(Topping.SAUSAGE);
        return this;
    }

    public PizzaBuilder addMushroom() {
        pizza.addTopping(Topping.MUSHROOMS);
        return this;
    }
    
    public PizzaBuilder addBacon() {
        pizza.addTopping(Topping.BACON);
        return this;
    }
    
    public PizzaBuilder addOnion() {
        pizza.addTopping(Topping.ONIONS);
        return this;
    }
    
    public PizzaBuilder addCheese() {
        pizza.addTopping(Topping.EXTRA_CHEESE);
        return this;
    }
    
    public PizzaBuilder addPepper() {
        pizza.addTopping(Topping.PEPPERS);
        return this;
    }
    
    public PizzaBuilder addChicken() {
        pizza.addTopping(Topping.CHICKEN);
        return this;
    }
    
    public PizzaBuilder addOlives() {
        pizza.addTopping(Topping.OLIVES);
        return this;
    }
    
    public PizzaBuilder addSpinach() {
        pizza.addTopping(Topping.SPINACH);
        return this;
    }
    
    public PizzaBuilder addTomatoBasil() {
        pizza.addTopping(Topping.TOMATO_AND_BASIL);
        return this;
    }
    
    public PizzaBuilder addBeef() {
        pizza.addTopping(Topping.BEEF);
        return this;
    }
    
    public PizzaBuilder addHam() {
        pizza.addTopping(Topping.HAM);
        return this;
    }
    
    public PizzaBuilder addPesto() {
        pizza.addTopping(Topping.PESTO);
        return this;
    }
    
    public PizzaBuilder addPork() {
        pizza.addTopping(Topping.SPICY_PORK);
        return this;
    }
    
    public PizzaBuilder addHamPineapple() {
        pizza.addTopping(Topping.HAM_AND_PINEAPPLE);
        return this;
    }

    public Pizza build() {
        return pizza;
    }
}
