package IngredientFactory;

import IngredientFactory.Cheese.Cheese;
import IngredientFactory.Cheese.MozzarellaCheese;
import IngredientFactory.Clams.Clams;
import IngredientFactory.Clams.FrozenClams;
import IngredientFactory.Dough.Dough;
import IngredientFactory.Dough.ThickCrustDough;
import IngredientFactory.Pepperoni.Pepperoni;
import IngredientFactory.Pepperoni.SlicedPepperoni;
import IngredientFactory.Sauce.Sauce;
import IngredientFactory.Sauce.PlumTomatoSauce;
import IngredientFactory.Veggies.Veggies;
import IngredientFactory.Veggies.EggPlant;
import IngredientFactory.Veggies.BlackOlives;
import IngredientFactory.Veggies.Spinach;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/26 0026 16:12
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {new EggPlant(), new BlackOlives(), new Spinach()};
        return veggies;
    }

    public Pepperoni createPepperoni(){
        return new SlicedPepperoni();
    }

    public Clams createClam(){
        return new FrozenClams();
    }
}
