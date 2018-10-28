
public class CreditCardNumDecorator extends CreditCardNum
{  
	  IDisplayComponent component;
	   public CreditCardNumDecorator( IDisplayComponent component ) {
		  this.component = component;
	   }
   
	   @Override
	   public String display() {
		  String display = super.display();
		  String shortenedDisplay = display.trim();
		  shortenedDisplay = shortenedDisplay.substring(1, shortenedDisplay.length()-1);
		  String newShortenedDisplay = shortenedDisplay.replaceAll("(.{" + 4 + "})", "$1 ").trim();
		  return "[" + newShortenedDisplay + "] ";
	   		   
   }
	   

	@Override
	public void addSubComponent(IDisplayComponent c) {
		// TODO Auto-generated method stub
		
	}

 }
    

