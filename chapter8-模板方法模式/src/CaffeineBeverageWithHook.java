/**
 * @author sqw123az@sina.com
 * @date 2019/7/30 0030 16:23
 */
public abstract class CaffeineBeverageWithHook {
    void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling water");
    }

    void pourInCup(){
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments(){
        return true;
    }
}
