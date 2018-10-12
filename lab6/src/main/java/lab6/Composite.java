package lab6;

import java.util.ArrayList;

/**
 * 
 * @author priyankasinghal
 * @version 1.0
 * Implementation for the Component Interface
 * Add/Remove/Iterate component objects
 *
 */
public class Composite implements Component{
	
	protected ArrayList<Component> components = new ArrayList<Component>()  ;
    protected String description ;
    protected double price;
    
    public Composite(String description) {
    	this.description = description;
	}
    
    public Composite(String description, double price) {
    	this.description = description;
    	this.price = price;
	}
    
    
    
    public ArrayList<Component> getComponents() {
		return components;
	}

	public void setComponents(ArrayList<Component> components) {
		this.components = components;
	}

	/**
     * Print Description of all the leaf components along with itself
     */
	@Override
	public void printDescription() {
		for(Component obj:components) {
			obj.printDescription();
		}
		
	}
	
	/**
     * Print Description of all the leaf components along with itself
     */
	@Override
	public void printPriceDescription() {
		for(Component obj:components) {
			obj.printPriceDescription();
		}
		
	}
	
	/**
	 * Add component to the list
	 * @param c Component object
	 */
	@Override
	public void addChild(Component c) {
		components.add(c);
	}
	
	/**
	 * Remove component from the list
	 * @param c Component object
	 */
	@Override
	public void removeChild(Component c) {
		components.remove(c);
		
	}
	
	/**
	 * Get Component at a particular index in the list
	 * @return Component
	 */
	@Override
	public Component getChild(int i) {
		return components.get(i);
	}

	@Override
	public double getPrice() {
		return price;
	}
    
    
    
    
}
