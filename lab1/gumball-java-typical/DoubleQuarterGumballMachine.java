/**
 * class DoubleQuarterGumballMachine - This class accepts two Quarters and returns a gumball when the crank is turned.
 * 
 * @Priyanka.singhal
 * @Sep 4,2018
 */
public class DoubleQuarterGumballMachine extends GumballMachine
{

    private int num_gumballs;
    private boolean has_quarter;
    private int sum;
    public static final String MACHINE_NAME = "Double Quarter Gumball Machine";

    public DoubleQuarterGumballMachine( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
        this.sum = 0;
    }
    
    public String getName(){
        return MACHINE_NAME;
    }
    public void insertCoin(int coin)
    {
        if ( coin == 25 )
        {
            this.has_quarter = true ;
            sum+=coin;
        }    
        else 
            this.has_quarter = false ;
    }
    
    public void turnCrank()
    {
        if ( this.has_quarter && this.sum == 50)
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
            if(this.sum > 0)
                System.out.println( "Please insert a Quarter. Balance: "+this.sum) ;
            else
                System.out.println( "Please insert a Quarter." ) ;
        }        
    }
    
    public String toString(){
       return this.getName();
    } 
}
