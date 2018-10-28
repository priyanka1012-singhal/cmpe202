
public class CreditCardExpDecorator extends CreditCardExp
{  	
	   IDisplayComponent component;
	   public CreditCardExpDecorator( IDisplayComponent component ) {
		  this.component = component;
	   }
	   
   
	   public String display() {
		  String display = super.display();
	   	  /*if(display.length()>4) {
	   		 StringBuilder sb = new StringBuilder(display.substring(0, 3));
	   		 sb.append("/");
			 sb.append(display.substring(3, display.length()));
			 return sb.toString().trim();
	   	  }else
	   		  return display;*/
		  return display;
	   		   
   }


	@Override
	public void addSubComponent(IDisplayComponent c) {
		// TODO Auto-generated method stub
		
	}

 }
    

