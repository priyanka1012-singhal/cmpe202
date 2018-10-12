package lab6;

public class Client {
	
	public static void main(String[] args) {
		Component theOrder = BuildOrder.getOrder() ;
		Context context = new Context(new CustomerReceiptPrintStrategy("Customer Receipt", theOrder));
		context.printDescription();
		context = new Context(new PackingSlipPrintStrategy("Packing Slip",theOrder));
		context.printDescription();
	}

}
