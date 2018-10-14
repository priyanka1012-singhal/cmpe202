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
public class Composite implements Component {
	
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
	 * @param component
	 */
	@Override
	public int compareTo(Component c) {
		return this.description.compareTo(c.getDescription());
		
	}
}
