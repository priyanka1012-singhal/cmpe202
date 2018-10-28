/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class UKPhoneNum implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String number = "" ;
	
    public UKPhoneNum() {
	}

	public UKPhoneNum(String number) {
		this.number = number;
	}

	public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( number.equals("") )
			return "[4444444444444444]" + "  " ;
		else
			return "[" + number + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		if ( cnt <= 16 )
			number += ch ;
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}
	
	public String getNumber() {
		return this.number;
	}

}