
public class CreditCardNumDecorator extends CreditCardNum
{  
	  IDisplayComponent component;
	   public CreditCardNumDecorator( IDisplayComponent component ) {
		  this.component = component;
	   }
   
	   @Override
	   public String display() {
		  String display = super.display();
		  if(display.length()>5) {
			  display = display.substring(1,display.length()-1);
			  char separator = ' ';
			  int interval = 4;
			  StringBuilder str = new StringBuilder(display);
			  for(int i = 0; i < display.length() / interval; i++) {
				  str.insert(((i + 1) * interval) + i, separator);
			  }
			  str.append("]");
			  return str.toString().trim();
		  }else {
			  return display;
		  }
		  
	   	  /*if(display.length()>4) {
	   		 StringBuilder sb = new StringBuilder(display.substring(0, 3));
	   		 sb.append("/");
			 sb.append(display.substring(3, display.length()));
			 return sb.toString().trim();
	   	  }else
	   		  return display;*/
	   		   
   }
	   

	@Override
	public void addSubComponent(IDisplayComponent c) {
		// TODO Auto-generated method stub
		
	}

 }
    

