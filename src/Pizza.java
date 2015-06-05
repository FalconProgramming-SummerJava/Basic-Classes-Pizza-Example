// Create new class (blueprint for) Pizza
public class Pizza {
	// Any Pizza object has a toppings property, an array of strings
	public String[] toppings = new String[5];
	
	// This is the Constructor, called whenever an object is made of this class
	// This constructor expects an array of strings to be passed to it.
	public Pizza(String[] toppingNames) {
		// take the toppings the user gave us and save it to our new object
		toppings = toppingNames;
		
		System.out.println("Pizza made!");		
	}
	
	// This is a method, any created object will have this method to be called manually
	public void printToppings() {
		// Loop through all the toppings, printing each
		for(int i = 0; i < toppings.length; i++) {
			System.out.println(toppings[i]);
		}
	}
}
