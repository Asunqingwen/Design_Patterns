package ChildClass;

import BaseClass.Beverage;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/19 0019 17:13
 */
public class Decaf extends Beverage {
    public Decaf(){
        description = "Decaf Coffee";
    }

    public double cost(){
        return 1.05;
    }
}
