
/**
 * class SingleQuarterGumballMachine - This class accepts single quarter only and follows a traditional 
 * gumball machine lifecycle.
 * 
 * @author (Priyanka.singhal)
 * @version (Sept 4, 2018)
 */
public class SingleQuarterGumballMachine

{
    GumballMachine gm;
    private int sum;
    public SingleQuarterGumballMachine(int numberGumballs) {
        gm = new GumballMachine(numberGumballs);
        this.sum = 0;
    }
    
    public void insertQuarter(int coin) {
        if ( coin == 25 ){
            sum += coin;
            if(sum >= 25){
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
