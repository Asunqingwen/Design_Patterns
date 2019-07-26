package PizzaFactory;

import IngredientFactory.NYPizzaIngredientFactory;
import IngredientFactory.PizzaIngredientFactory;
import Pizza.Pizza;
import Pizza.ChicagoStyleCheesePizza;
/**
 * @author sqw123az@sina.com
 * @date 2019/7/26 0026 11:31
 */
public class CaliforniaPizzaStore extends PizzaStore {
    Pizza createPizza(String item){
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if ("cheese".equals(item)) {
            return new ChicagoStyleCheesePizza(ingredientFactory);
        }
        return null;
    }
}
