package lab6;

import java.text.DecimalFormat;
import java.util.List;

/**
 * 
 * @author priyankasinghal
 * @version
 * implements the customer receipt Strategy
 *
 */
public class CustomerReceiptPrintStrategy implements IPrintStrategy {
	
	private Component order;
	private String description;
	private double total;
	private static final String SUBTOTAL_STRING = "Sub. Total:";
	
	
	public CustomerReceiptPrintStrategy(String desc,Component order) {
		this.order = order;
		description = desc;
	}

	/**
     * Print Description of all the components 
     */
	public void printDescription() {
	   DecimalFormat fmt = new DecimalFormat("0.00");
	   StringBuffer str = new StringBuffer();
	   System.out.println( "===========" + description + "===========" );
	   
	   for(Component obj:((Composite)order).getComponents()) {
		   str.append(obj.getDescription());
	       int descLen = obj.getDescription().length() ;
	       if (descLen < 35 ) {
	           int pad = (35 - descLen) / 2 ;
	           str.append(HelperUtility.padSpaces( pad ));
	       }
	       if(obj.getPrice()>0.00)
	      	str.append(" " + fmt.format(obj.getPrice()));
	       str.append("\n");
	       //Printing subcomponents
	       if(obj instanceof Composite) {
	    	   List<Component> children = ((Composite)obj).getComponents();
		       for(Component child:children) {
		    	   str.append("  "+child.getDescription());
		    	   str.append("\n");
		       }
	       }
	    	   
		   total += obj.getPrice();
		}
	  
       str.append(SUBTOTAL_STRING);
       int descLen = SUBTOTAL_STRING.length() ;
       if (descLen < 32 ) {
           int pad = (32 - descLen) / 2 ;
           str.append(HelperUtility.padSpaces( pad ));
       }
       str.append("$"+fmt.format(total));
       System.out.println(str);
	   System.out.println( "============================================" );
	}

}
