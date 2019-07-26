package Pizza;

import IngredientFactory.PizzaIngredientFactory;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/26 0026 11:44
 */
public class CaliforniaStyleCheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CaliforniaStyleCheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    void prepare(){
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
