package functional_version;
/**
 * 
 * @author priyankasinghal
 *
 */
public interface Beverage {
	
	String getDescription();
	 
    static Beverage whip(Beverage beverage) {
        return new Beverage() {
            @Override
            public String getDescription() {
                return beverage.getDescription() + " whip";
            }
        };
    }
 
    static Beverage mocha(Beverage beverage) {
        return new Beverage() {
            @Override
            public String getDescription() {
                return beverage.getDescription() + " mocha";
            }
        };
    }

}
