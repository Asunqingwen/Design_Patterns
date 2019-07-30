/**
 * @author sqw123az@sina.com
 * @date 2019/7/30 0030 16:32
 */
public class BeverageTestDrive {
    public static void main(String[] args) {
        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHoook = new CoffeeWithHook();

        System.out.println("\nMaking tea...");
        teaHook.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffeeHoook.prepareRecipe();
    }
}
