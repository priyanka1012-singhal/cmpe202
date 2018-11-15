package functional_version;

import java.util.function.Function;
import java.util.stream.Stream;

public class CondimentDecorator implements Beverage{
	
	private Function<Beverage,Beverage> condiments;
	
	private CondimentDecorator(Function<Beverage, Beverage>... condiments) {
		this.condiments = Stream.of(condiments)
            .reduce(Function.identity(), Function::andThen);

	}

	public static String getDescription(Beverage beverage, Function<Beverage, Beverage>... condiments) { 
		return new CondimentDecorator(condiments).getDescription(beverage);
	}

	private String getDescription(Beverage beverage) { 
		return this.condiments.apply(beverage).getDescription();
	}

	@Override
	public String getDescription() {
		// Not used
		return "";
	}

}
