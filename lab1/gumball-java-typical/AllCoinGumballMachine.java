/**
 * class AllCoinGumballMachine - This class accepts all coins: dimes, nickels and Quarters and returns a gumball when the 
 * crank is turned.
 *
 * @author Priyanka Singhal
 * @version 1.0
 */
public class AllCoinGumballMachine extends GumballMachine
{
    private int num_gumballs;
    private boolean has_quarter;
    private int sum;
    public static final String MACHINE_NAME = "All Coins Gumball Machine";

    public AllCoinGumballMachine( int size )
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
        if ( coin == 25 || coin == 5 || coin == 10)
        {
            sum += coin;
            if(sum >= 50)
                this.has_quarter = true;
        }
        else 
            this.has_quarter = false ;
    }
    public void turnCrank()
    {
        if ( this.has_quarter)
        {
            if ( this.num_gumballs > 0 )
            {
                this.sum = 0;
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
                System.out.println( "Please insert a Quarter." ) ;
        }        
    }
    public String toString(){
       return this.getName()+ "\nNumber of Gumballs: " + this.num_gumballs ;
    } 
}
