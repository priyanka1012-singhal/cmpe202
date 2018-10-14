package lab6;
/**
 * 
 * @author priyankasinghal
 * @version
 * Leaf class for composite pattern
 *
 */
public class Leaf implements Component {

   private String description ;
   protected double price ;

   public Leaf ( String d, double p )
   {
       description = d ;
       price = p ;
   }
   
   public Leaf ( String d )
   {
       description = d ;
   }
   
   /**
	 * Get the price
	 * @return price
	 */
	@Override
	public double getPrice() {
		return price;
	}
	
	/**
	 * Get the description
	 * @return description
	 */
	@Override
	public String getDescription() {
		return description;
	}
	 
	/**
	 * Add Child component (Not Used)
	 * @return Component
	 */
   public void addChild(Component c) {
	    // no implementation
	}

   /**
	 * Remove Child component (Not Used)
	 * @return Component
	 */
	public void removeChild(Component c) {
       // no implementation
	}
	
	/**
	 * @param component
	 */
	@Override
	public int compareTo(Component c) {
		return this.description.compareTo(c.getDescription());
		
	}
}

