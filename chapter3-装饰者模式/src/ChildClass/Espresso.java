package ChildClass;

import BaseClass.Beverage;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/19 0019 17:08
 */
public class Espresso extends Beverage {
    public Espresso(){
        description = "Espresso Coffee";
    }

    public double cost(){
        return 1.99;
    }
}
