package IngredientFactory;

import IngredientFactory.Cheese.Cheese;
import IngredientFactory.Cheese.ReggianoCheese;
import IngredientFactory.Clams.Clams;
import IngredientFactory.Clams.FreshClams;
import IngredientFactory.Dough.Dough;
import IngredientFactory.Dough.ThickCrustDough;
import IngredientFactory.Pepperoni.Pepperoni;
import IngredientFactory.Pepperoni.SlicedPepperoni;
import IngredientFactory.Sauce.Sauce;
import IngredientFactory.Sauce.MarinaraSauce;
import IngredientFactory.Veggies.Veggies;
import IngredientFactory.Veggies.Garlic;
import IngredientFactory.Veggies.Onion;
import IngredientFactory.Veggies.Mushroom;
import IngredientFactory.Veggies.RedPepper;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/26 0026 16:04
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    public Pepperoni createPepperoni(){
        return new SlicedPepperoni();
    }

    public Clams createClam(){
        return new FreshClams();
    }
}
