package Duck;

import Fly.FlyBehavior;
import Quack.QuackBehavior;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/18 0018 16:51
 */
public abstract class Duck {
    //为行为接口类型声明两个引用变量，所有鸭子子类都继承它们
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();


    //委托给行为类
    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float,even decoys!");
    }


    //动态设定行为
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
