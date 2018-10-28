
public class CreditCardExpDecorator extends CreditCardExp
{  	
	   IDisplayComponent component;
	   public CreditCardExpDecorator( IDisplayComponent component ) {
		  this.component = component;
	   }
	   
   
	   public String display() {
		  String display = super.display();
		  String shortenedDisplay = display.trim();
		  shortenedDisplay = shortenedDisplay.substring(1, shortenedDisplay.length()-1);

		  if(shortenedDisplay.length() >= 3) {
			  shortenedDisplay = shortenedDisplay.substring(0, 2) + "/" + shortenedDisplay.substring(2);
		  }
		  return "[" + shortenedDisplay + "] ";
	   		   
   }


	@Override
	public void addSubComponent(IDisplayComponent c) {
		// TODO Auto-generated method stub
		
	}

 }
    

