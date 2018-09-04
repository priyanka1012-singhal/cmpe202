/**
 * class AllCoinGumballMachine - This class accepts all coins: dimes, nickels and Quarters and returns a gumball when the crank is turned.
 *
 * @Priyanka.singhal
 * @Sep 4,2018
 */
public class AllCoinGumballMachine extends GumballMachine
{
    private int num_gumballs;
    private boolean has_coin;
    private int sum;
    public static final String MACHINE_NAME = "All Coins Gumball Machine";

    public AllCoinGumballMachine( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_coin = false;
        this.sum = 0;
    }
    
    public String getName(){
        return MACHINE_NAME;
    }
    public void insertCoin(int coin)
    {
        if ( coin == 25 || coin == 5 || coin == 10)
        {
             this.has_coin = true ;
             sum+=coin;
        }
        else 
            this.has_coin = false ;
    }
    
    public void turnCrank()
    {
        if ( this.has_coin && this.sum == 50 )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_coin = false ;
                System.out.println( "Thanks for the coin(s).  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your coin(s)." ) ;
            }
        }
        else 
        {
            if(this.sum > 0)
                System.out.println( "Please insert a coin. Balance: "+this.sum) ;
            else
                System.out.println( "Please insert a coin." ) ;
        }        
    }
    
    public String toString(){
       return this.getName();
    } 
}
