package lab6;
/**
 * 
 * @author priyankasinghal
 * @version 1.0 
 * Build Customer's Order
 *
 */
public class BuildOrder {
	
  /**
   * Gets Order component	
   * @return order component
   */
  public static Component getOrder()
  {
      Composite order = new Composite( "Order" ) ;

      Burger burger = new Burger( "LBB",5.59) ;
      // Setup Burger Ingredients
      burger.addChild( new Leaf("{{{{BACON}}}}")  ) ;
      burger.addChild( new Leaf("LETTUCE") ) ;
      burger.addChild( new Leaf("TOMATO") ) ;
      burger.addChild( new Leaf("->|G ONION") ) ;
      burger.addChild( new Leaf("->|JALA Grilled") ) ;
      
            
      // Add Burger to the Order
      order.addChild( burger );
      order.addChild(new Leaf("LTL CAJ",2.79));
      return order ;
  }

}
