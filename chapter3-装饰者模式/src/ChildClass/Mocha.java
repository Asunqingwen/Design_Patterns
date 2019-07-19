package ChildClass;

import BaseClass.Beverage;
import BaseClass.CondimentDecorator;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/19 0019 17:15
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
