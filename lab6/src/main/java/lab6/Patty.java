package lab6;


public class Patty extends LeafDecorator
{
	private String[] options ;
	private final static String OPEN_SYMBOL = "{{{{";
	private final static String CLOSE_SYMBOL = "}}}}";
    
    
    public Patty( String desc )
    {
        super(desc) ;
    }
    
    
    public void setOptions( String[] options )
    {
        this.options = options ;
    }
    
    public String getDescription() 
    {
    	StringBuilder desc = new StringBuilder();
        for ( int i = 0; i<options.length; i++ )
        {
        	desc.append(" ");
        	desc.append(OPEN_SYMBOL);
            desc.append(options[i]);
            desc.append(CLOSE_SYMBOL);
        }        
        return desc.toString() ;
    }
    
}