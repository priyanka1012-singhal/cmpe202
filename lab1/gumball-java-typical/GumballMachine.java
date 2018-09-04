
/**
 * Abstract class GumballMachine  
 *
 * @Priyanka.singhal
 * @Sep 3,2018
 */
public abstract class GumballMachine
{
   public abstract String getName();
   public abstract void insertCoin(int coin);
   public abstract void turnCrank();
   
   public String toString(){
       return this.getName();
    } 
   
}
