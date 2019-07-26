package Pizza;

import IngredientFactory.Cheese.Cheese;
import IngredientFactory.Clams.Clams;
import IngredientFactory.Dough.Dough;
import IngredientFactory.Pepperoni.Pepperoni;
import IngredientFactory.Sauce.Sauce;
import IngredientFactory.Veggies.Veggies;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/26 0026 11:05
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    public abstract void prepare();

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        //这里是打印披萨的代码
        return "";
    }
}
