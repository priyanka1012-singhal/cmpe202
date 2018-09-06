
/**
 * class AllCoinsGumballMachine - This class accepts all coins: quarter, dime and nickel and follows a 
 * traditional gumball machine lifecycle.
 *
 * @author (Priyanka.singhal)
 * @version (Sept 5, 2018)
 */
public class AllCoinsGumballMachine
{
    GumballMachine gm;
    private int sum;
    public AllCoinsGumballMachine(int numberGumballs) {
        gm = new GumballMachine(numberGumballs);
        this.sum = 0;
    }
    
    public void insertQuarter(int coin) {
        if ( coin == 25 || coin == 5 || coin == 10 ){
                sum += coin;
                if(sum >= 50){
                   gm.insertQuarter();
                }    
        }    
        else 
             gm.ejectQuarter();
    }
    
    public void turnCrank(){
        sum = 0;
        gm.turnCrank();
    }    
    
    public String toString() {
        return gm.toString();
    }
}
