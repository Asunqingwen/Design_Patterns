package ChildClass;

import BaseClass.Beverage;
import BaseClass.CondimentDecorator;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/19 0019 17:21
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip (Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
