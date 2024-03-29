import java.awt.*;

/**
 * @author sqw123az@sina.com
 * @date 2019/8/1 0001 14:57
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter,the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject,you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
