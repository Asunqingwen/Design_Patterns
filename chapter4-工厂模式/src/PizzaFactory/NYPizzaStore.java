package PizzaFactory;

import IngredientFactory.NYPizzaIngredientFactory;
import IngredientFactory.PizzaIngredientFactory;
import Pizza.Pizza;
import Pizza.ChicagoStyleCheesePizza;
import Pizza.NYStyleVeggiePizza;
import Pizza.NYStyleClamPizza;
import Pizza.NYStylePepperoniPizza;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/26 0026 11:20
 */
public class NYPizzaStore extends PizzaStore {
    Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        switch (item) {
            case "cheese":
                pizza = new ChicagoStyleCheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
            case "veggie":
                return new ChicagoStyleCheesePizza(ingredientFactory);
            case "clam":
                return new ChicagoStyleCheesePizza(ingredientFactory);
            case "pepperoni":
                return new ChicagoStyleCheesePizza(ingredientFactory);
            default:
                return null;
        }
    }
}
