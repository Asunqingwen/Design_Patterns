package ChildClass;

import BaseClass.Beverage;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/19 0019 17:11
 */
public class DarkRoast extends Beverage {
    public DarkRoast (){
        description = "DarkRoast Coffee";
    }

    public double cost(){
        return .99;
    }
}
