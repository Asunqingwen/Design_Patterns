package Duck;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/30 0030 9:32
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Duck.Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck.Duck says...");
        testDuck(duck);

        System.out.println("\nThe Duck.TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
