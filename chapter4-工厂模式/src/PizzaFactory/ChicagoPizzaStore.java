package PizzaFactory;
import IngredientFactory.ChicagoPizzaIngredientFactory;
import IngredientFactory.PizzaIngredientFactory;
import Pizza.Pizza;
import Pizza.ChicagoStyleCheesePizza;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/26 0026 11:30
 */
public class ChicagoPizzaStore extends PizzaStore {
    Pizza createPizza(String item){
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if ("cheese".equals(item)) {
            return new ChicagoStyleCheesePizza(ingredientFactory);
        }
        return null;
    }
}
