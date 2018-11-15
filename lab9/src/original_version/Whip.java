package original_version;

public class Whip extends CondimentDecorator {
    
	Whip(Beverage beverage) {
        super(beverage);
    }
 
    @Override
    public String getDescription() {
        return super.getDescription() + " whip";
    }
}
 