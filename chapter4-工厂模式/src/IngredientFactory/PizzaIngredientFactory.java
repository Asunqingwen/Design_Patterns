package IngredientFactory;

import IngredientFactory.Cheese.Cheese;
import IngredientFactory.Clams.Clams;
import IngredientFactory.Dough.Dough;
import IngredientFactory.Pepperoni.Pepperoni;
import IngredientFactory.Sauce.Sauce;
import IngredientFactory.Veggies.Veggies;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/26 0026 16:01
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
