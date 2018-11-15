package original_version;

public class CondimentDecorator implements Beverage{
	
	 private final Beverage beverage;
	 
	    protected CondimentDecorator(Beverage beverage) {
	        this.beverage = beverage;
	    }
	 
	    @Override
	    public String getDescription() {
	        return beverage.getDescription();
	    }

}
