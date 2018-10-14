package lab6;

import java.util.Collections;
import java.util.List;

/**
 * 
 * @author priyankasinghal
 * @version
 * implements the packing slip Strategy
 *
 */
public class PackingSlipPrintStrategy implements IPrintStrategy {
	
	private Component order;
	private String description;
	
	public PackingSlipPrintStrategy(String desc, Component order) {
		this.order = order;
		description = desc;
	}

	/**
     * Print Description of all the components 
     */
	@Override
	public void printDescription() {
		StringBuffer str = new StringBuffer();
		System.out.println( "===========" + description + "=====================" );
		for(Component obj:((Composite)order).getComponents()) {
			str.append(obj.getDescription());
			str.append("\n");
			//Printing subcomponents
		     if(obj instanceof Composite) {
		    	  List<Component> children = ((Composite)obj).getComponents();
			      Collections.sort(children);
			      for(Component child:children) {
			    	  str.append("  "+child.getDescription());
			    	  str.append("\n");
			      }
		     }
		}
		System.out.println(str);
		System.out.println( "============================================" );
	}

}
