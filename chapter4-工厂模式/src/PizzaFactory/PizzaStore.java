package PizzaFactory;

import Pizza.Pizza;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/26 0026 11:16
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);

}
