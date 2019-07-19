package Duck;

import Fly.FlyNoWay;
import Quack.Quack;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/18 0018 17:48
 */
public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("I'm a model duck");
    }
}
