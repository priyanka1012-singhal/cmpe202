package lab6;

/**
 * 
 * @author priyankasinghal
 * @version 1.0
 * Component Interface for the Composite pattern
 *
 */
public interface Component extends Comparable<Component>{
	String getDescription() ;
	double getPrice();
    void addChild(Component c);
    void removeChild(Component c);
    int compareTo(Component c);

}
