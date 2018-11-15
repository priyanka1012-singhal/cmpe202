package original_version;

public class Mocha extends CondimentDecorator {
    
	Mocha(Beverage beverage) {
        super(beverage);
    }
 
    @Override
    public String getDescription() {
        return super.getDescription() + " mocha";
    }
}
 