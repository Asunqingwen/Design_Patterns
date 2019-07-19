package ChildClass;

import BaseClass.Beverage;
import BaseClass.CondimentDecorator;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/19 0019 17:19
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
