package ChildClass;

import BaseClass.Beverage;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/19 0019 17:10
 */
public class HouseBlend extends Beverage {
    public HouseBlend(){
        description = "House Blend Coffee";
    }

    public double cost(){
        return .89;
    }
}
