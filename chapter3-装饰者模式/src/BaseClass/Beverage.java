package BaseClass;


/**
 * @author sqw123az@sina.com
 * @date 2019/7/19 0019 17:04
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
