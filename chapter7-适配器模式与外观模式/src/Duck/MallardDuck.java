package Duck;

import Duck.Duck;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/30 0030 9:27
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
