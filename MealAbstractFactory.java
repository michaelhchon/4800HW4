
public class MealAbstractFactory {
	private static MealAbstractFactory instance;

    private MealAbstractFactory() {}

    public static MealAbstractFactory getInstance() {
        if (instance == null) {
            instance = new MealAbstractFactory();
        }
        return instance;
    }

    public MealFactory getFactory() {
        return new MealFactoryImpl();
    }
}

// Abstract Factory Implementation
class MealFactoryImpl implements MealFactory {
	private final CarbsFactory carbsFactory = new CarbsFactory();
	private final ProteinFactory proteinFactory = new ProteinFactory();
	private final FatsFactory fatsFactory = new FatsFactory();
	
 	@Override
 	public Carbs createCarbs(String dietPlan) {
 		switch (dietPlan) {
     	case "No Restriction":
     		return new CarbsNoRestriction();
     	case "Paleo":
         return new CarbsPaleo();
     	case "Vegan":
     		return new CarbsVegan();
     	case "Nut Allergy":
     		return new CarbsNutAllergy();
     	default:
     		throw new IllegalArgumentException("Invalid diet plan");
 		}
 	}

 	@Override
 	public Protein createProtein(String dietPlan) {
 		switch (dietPlan) {
     	case "No Restriction":
     		return new ProteinNoRestriction();
     	case "Paleo":
     		return new ProteinPaleo();
     	case "Vegan":
     		return new ProteinVegan();
     	case "Nut Allergy":
     		return new ProteinNutAllergy();
     	default:
     		throw new IllegalArgumentException("Invalid diet plan");
 		}
 	}

 	@Override
 	public Fats createFats(String dietPlan) {
 		switch (dietPlan) {
     	case "No Restriction":
     		return new FatsNoRestriction();
     	case "Paleo":
     		return new FatsPaleo();
     	case "Vegan":
     		return new FatsVegan();
     	case "Nut Allergy":
     		return new FatsNutAllergy();
     	default:
     		throw new IllegalArgumentException("Invalid diet plan");
 		}
 	}
}
