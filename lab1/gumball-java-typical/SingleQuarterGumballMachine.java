
/**
 * class SingleQuarterGumballMachine - This class accepts only Quarters and returns a gumball when the crank is turned.
 *
 * @Priyanka.singhal
 * @Sep 4,2018
 */
public class SingleQuarterGumballMachine extends GumballMachine
{
    private int num_gumballs;
    private boolean has_quarter;
    public static final String MACHINE_NAME = "Single Quarter Gumball Machine";

    public SingleQuarterGumballMachine( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
    }
    
    public String getName(){
        return MACHINE_NAME;
    }
    public void insertCoin(int coin)
    {
        if ( coin == 25 )
            this.has_quarter = true ;
        else 
            this.has_quarter = false ;
    }
    
    public void turnCrank()
    {
        if ( this.has_quarter )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_quarter = false ;
                System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else 
        {
            System.out.println( "Please insert a quarter" ) ;
        }        
    }
    
    public String toString(){
       return this.getName();
    } 
}
