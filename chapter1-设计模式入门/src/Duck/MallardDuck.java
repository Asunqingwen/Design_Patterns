package Duck;

import Fly.FlyWithWings;
import Quack.Quack;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/18 0018 17:05
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
