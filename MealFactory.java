import java.util.List;
import java.util.Random;

// Abstract Factory for creating Carbs, Protein, and Fats
interface MealFactory {
	Carbs createCarbs(String dietPlan);
	Protein createProtein(String dietPlan);
	Fats createFats(String dietPlan);
}

// Carb Factory
class CarbsFactory {
	public static Carbs createCarbs(String dietPlan) {
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
}

// Protein Factory
class ProteinFactory {
	public static Protein createProtein(String dietPlan) {
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
}

// Fats Factory
class FatsFactory {
	public static Fats createFats(String dietPlan) {
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

// Interface for Carbs
interface Carbs {
	String getName();
}

class Cheese implements Carbs {
	@Override
	public String getName() {
		return "Cheese";
	}
}

class Bread implements Carbs {
	@Override
	public String getName() {
		return "Bread";
 	}
}

class Lentils implements Carbs {
	@Override
	public String getName() {
		return "Lentils";
	}
}

class Pistachio implements Carbs {
	@Override
	public String getName() {
		return "Pistachio";
	}
}

// Interface for Protein
interface Protein {
	String getName();
}

class Fish implements Protein {
	@Override
	public String getName() {
		return "Fish";
	}
}

class Chicken implements Protein {
	@Override
	public String getName() {
		return "Chicken";
	}
}

class Beef implements Protein {
	@Override
	public String getName() {
		return "Beef";
	}
}

class Tofu implements Protein {
	@Override
	public String getName() {
		return "Tofu";
	}
}

// Interface for Fats
interface Fats {
	String getName();
}

class Avocado implements Fats {
	@Override
	public String getName() {
		return "Avocado";
	}
}

class SourCream implements Fats {
	@Override
	public String getName() {
		return "Sour Cream";
	}
}

class Tuna implements Fats {
	@Override
	 public String getName() {
	     return "Tuna";
	}
}

class Peanuts implements Fats {
	@Override
	public String getName() {
		return "Peanuts";
	}
}

// No Restriction
class CarbsNoRestriction implements Carbs {
	private static final List<Carbs> options = List.of(new Cheese(), new Bread(), new Lentils(), new Pistachio());

	@Override
	public String getName() {
    	return options.get(new Random().nextInt(options.size())).getName();
	}
}

class ProteinNoRestriction implements Protein {
	private static final List<Protein> options = List.of(new Fish(), new Chicken(), new Beef(), new Tofu());

	@Override
	public String getName() {
		return options.get(new Random().nextInt(options.size())).getName();
	}
}

class FatsNoRestriction implements Fats {
	private static final List<Fats> options = List.of(new Avocado(), new SourCream(), new Tuna(), new Peanuts());

	@Override
	public String getName() {
		return options.get(new Random().nextInt(options.size())).getName();
	}
}

// Paleo
class CarbsPaleo implements Carbs {
	private static final List<Carbs> options = List.of(new Pistachio());

	@Override
	public String getName() {
		return options.get(new Random().nextInt(options.size())).getName();
	}
}

class ProteinPaleo implements Protein {
	private static final List<Protein> options = List.of(new Fish(), new Chicken(), new Beef());

	@Override
	public String getName() {
		return options.get(new Random().nextInt(options.size())).getName();
	}
}

class FatsPaleo implements Fats {
	private static final List<Fats> options = List.of(new Avocado(), new Tuna());

	@Override
	public String getName() {
		return options.get(new Random().nextInt(options.size())).getName();
	}
}

// Vegan
class CarbsVegan implements Carbs {
	private static final List<Carbs> options = List.of(new Pistachio());

	@Override
	public String getName() {
		return options.get(new Random().nextInt(options.size())).getName();
	}
}

class ProteinVegan implements Protein {
	private static final List<Protein> options = List.of(new Tofu());

	@Override
	public String getName() {
		return options.get(new Random().nextInt(options.size())).getName();
	}
}

class FatsVegan implements Fats {
	private static final List<Fats> options = List.of(new Avocado());

 	@Override
	public String getName() {
 		return options.get(new Random().nextInt(options.size())).getName();
 	}
}

// Nut Allergy
class CarbsNutAllergy implements Carbs {
	private static final List<Carbs> options = List.of(new Cheese(), new Bread(), new Lentils());

	@Override
	public String getName() {
		return options.get(new Random().nextInt(options.size())).getName();
	}
}

class ProteinNutAllergy implements Protein {
	private static final List<Protein> options = List.of(new Fish(), new Chicken(), new Beef(), new Tofu());

	@Override
	public String getName() {
    	return options.get(new Random().nextInt(options.size())).getName();
	}
}

class FatsNutAllergy implements Fats {
	private static final List<Fats> options = List.of(new Avocado(), new SourCream(), new Tuna());

	@Override
	public String getName() {
		return options.get(new Random().nextInt(options.size())).getName();
	}
}



