package lab6;

/**
 * 
 * @author priyankasinghal
 * @version 1.0
 * Component Interface for the Composite pattern
 *
 */
public interface Component {
	void printDescription() ;
	double getPrice();
    void addChild(Component c);
    void removeChild(Component c);
    Component getChild(int i);
	void printPriceDescription();

}
