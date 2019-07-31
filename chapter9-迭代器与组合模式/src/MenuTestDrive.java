/**
 * @author sqw123az@sina.com
 * @date 2019/7/31 0031 11:00
 */
public class MenuTestDrive {
    public static void main(String[] args) {
/*        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu,dinerMenu,cafeMenu);

        waitress.printMenu();*/

        MenuComponent pancakeHouseMenu = new Menus("PANCAKE HOUSE MENU","Breakfast");
        MenuComponent dinerMenu = new Menus("DINER MENU","Lunch");
        MenuComponent cafeMenu = new Menus("CAFE MENU","Dinner");
        MenuComponent dessertMenu = new Menus("DESSERT MENU","Dessert of course!");

        MenuComponent allMenus = new Menus("ALL MENUS","ALL menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem(
                "Pasta",
                "Spaghetti with Marinara Sauce,and a slice of sourdough bread",
                true,
                3.89
        ));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with a flakey crust,topped with vanilla ice cream",
                true,
                1.59
        ));

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
