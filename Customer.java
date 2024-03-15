
public class Customer {
	private final String name;
    private final String dietPlan;

    public Customer(String name, String dietPlan) {
        this.name = name;
        this.dietPlan = dietPlan;
    }

    public String getName() {
        return name;
    }

    public String getDietPlan() {
        return dietPlan;
    }

    public Meal generateMeal() {
        MealFactory mealFactory = MealAbstractFactory.getInstance().getFactory();
        Carbs carbs = mealFactory.createCarbs(dietPlan);
        Protein protein = ProteinFactory.createProtein(dietPlan);
        Fats fats = FatsFactory.createFats(dietPlan);
        return new Meal(carbs, protein, fats);
    }
}
