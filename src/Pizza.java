public class Pizza {
	public String[] toppings = new String[5];
	
	public Pizza(String[] toppingNames) {
		toppings = toppingNames;
		System.out.println("Pizza made!");		
	}
	
	public void printToppings() {
		for(int i = 0; i < toppings.length; i++) {
			System.out.println(toppings[i]);
		}
	}
}
