package ChildClass;

import BaseClass.Beverage;
import BaseClass.CondimentDecorator;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/19 0019 17:22
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
