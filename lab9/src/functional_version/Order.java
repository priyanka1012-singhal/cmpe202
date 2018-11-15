package functional_version;

public class Order {

	public static void main(String[] args) {
		
		String coffeeOrder  = CondimentDecorator.getDescription(new Cappucino(), Beverage::whip, Beverage::mocha);
		System.out.println(coffeeOrder);

	}

}
