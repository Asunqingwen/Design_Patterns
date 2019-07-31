import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/31 0031 10:08
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus){
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }

    private void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

    public void printVegetarianMenu(){
        Iterator iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n----");
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            try {
                if(menuComponent.isVegetarian()){
                    menuComponent.print();
                }
            }catch (UnsupportedOperationException e){

            }
        }
    }
}
