/**
 * Main class
 * @author Priyanka Singhal
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {
        GumballMachine singleQuarterGumballMachine = new SingleQuarterGumballMachine(3);
        GumballMachine doubleQuarterGumballMachine = new DoubleQuarterGumballMachine(3);
        GumballMachine allCoinGumballMachine = new AllCoinGumballMachine(3);
        
        System.out.println(singleQuarterGumballMachine);
        singleQuarterGumballMachine.insertCoin( 25 );
        singleQuarterGumballMachine.turnCrank();
        singleQuarterGumballMachine.insertCoin( 25 );
        singleQuarterGumballMachine.turnCrank();
        singleQuarterGumballMachine.insertCoin( 25 );
        singleQuarterGumballMachine.turnCrank();
        singleQuarterGumballMachine.insertCoin( 25 );
        singleQuarterGumballMachine.turnCrank();
        
        System.out.println(doubleQuarterGumballMachine);
        doubleQuarterGumballMachine.insertCoin( 25 );
        doubleQuarterGumballMachine.turnCrank();
        doubleQuarterGumballMachine.insertCoin( 25 );
        doubleQuarterGumballMachine.turnCrank();
        doubleQuarterGumballMachine.insertCoin( 25 );
        doubleQuarterGumballMachine.turnCrank();
        doubleQuarterGumballMachine.insertCoin( 25 );
        doubleQuarterGumballMachine.turnCrank();
        
        
        System.out.println(allCoinGumballMachine);
        allCoinGumballMachine.insertCoin( 25 );
        allCoinGumballMachine.turnCrank();
        allCoinGumballMachine.insertCoin( 5 );
        allCoinGumballMachine.turnCrank();
        allCoinGumballMachine.insertCoin( 10 );
        allCoinGumballMachine.turnCrank();
        allCoinGumballMachine.insertCoin( 10 );
        allCoinGumballMachine.turnCrank();
        allCoinGumballMachine.insertCoin( 25 );
        allCoinGumballMachine.turnCrank();
        allCoinGumballMachine.insertCoin( 25 );
        allCoinGumballMachine.turnCrank();
        
    }
}
