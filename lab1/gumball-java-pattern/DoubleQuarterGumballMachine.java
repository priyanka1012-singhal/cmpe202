
/**
 * class DoubleQuarterGumballMachine - This class expects two quarters and follows a traditional 
 * gumball machine lifecycle.
 *
 * @author (Priyanka.singhal)
 * @version (Sept 5, 2018)
 */
public class DoubleQuarterGumballMachine
{
    GumballMachine gm;
    private int sum;
    public DoubleQuarterGumballMachine(int numberGumballs) {
        gm = new GumballMachine(numberGumballs);
        this.sum = 0;
    }
    
    public void insertQuarter(int coin) {
        if ( coin == 25 ){
                sum += coin;
                if(sum >= 50){
                   System.out.println("HELLO:::"+sum);
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
