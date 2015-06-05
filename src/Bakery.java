public class Bakery {
	// This special method starts everything
	public static void main(String[] args) {
		// Create an object of the pizza class with Cheese and Pepperoni toppings
		String[] toppings = {"Cheese", "Pepperoni"};
		Pizza perrysPizza = new Pizza(toppings);

		// Call the printToppings method every pizza has to list this object's toppings.
		perrysPizza.printToppings();
		
		// What would happen if you created a new pizza with different toppings?
		String[] newToppings = {/* insert toppings here */};
		Pizza otherPizza = new Pizza(newToppings);
		
		// What happens if we call printToppings on the new Pizza,
		// and then call it on the original pizza object we created?
		// Take your best guess, then try it out!
	}
}
