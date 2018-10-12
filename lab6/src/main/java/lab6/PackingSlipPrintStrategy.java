package lab6;

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
		System.out.println( "===========" + description + "=====================" );
		for(Component obj:((Composite)order).getComponents()) {
			obj.printDescription();
		}
		System.out.println( "============================================" );
	}

}
