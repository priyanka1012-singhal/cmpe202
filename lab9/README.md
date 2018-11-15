# Decorator pattern using lambdas

1. Using lambdas for decorator design pattern avoided the use of inheritance.
2. Decoration is done using the following lambda expression
	this.condiments = Stream.of(condiments)
            .reduce(Function.identity(), Function::andThen);
 	#function call
    CondimentDecorator.getDescription(new Cappucino(), Beverage::whip, Beverage::mocha);