package main;

import Pizza.Pizza;
import PizzaFactory.ChicagoPizzaStore;
import PizzaFactory.NYPizzaStore;
import PizzaFactory.PizzaStore;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/26 0026 14:41
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
