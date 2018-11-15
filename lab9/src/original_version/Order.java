package original_version;

public class Order {

	public static void main(String[] args) {
		
		Beverage Cappucino = new Mocha(new Whip(new Cappucino()));
		String coffeeOrder  = Cappucino.getDescription();  
		System.out.println(coffeeOrder);

	}

}
