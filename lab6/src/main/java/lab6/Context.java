package lab6;

/**
 * 
 * @author priyankasinghal
 * @version 1.0
 * Context for strategy
 *
 */
public class Context {
	   private IPrintStrategy strategy;

	   public Context(IPrintStrategy strategy){
	      this.strategy = strategy;
	   }

	   public void printDescription(){
	      strategy.printDescription();
	   }
	}