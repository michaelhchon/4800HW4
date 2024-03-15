import java.util.ArrayList;
import java.util.List;

public class MealDriver {

	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("Michael", "Nut Allergy"));
		customers.add(new Customer("Ashley", "Vegan"));
		customers.add(new Customer("Clay", "No Restriction"));
		customers.add(new Customer("Annie", "Paleo"));
		customers.add(new Customer("Kevin", "Nut Allergy"));
		customers.add(new Customer("Jessica", "No Restriction"));
		
		for(Customer customer : customers) {
			Meal meal = customer.generateMeal();
			System.out.println(customer.getName() + " - " + meal);
		}
	}

}
