import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/31 0031 9:23
 */
public class PancakeHouseMenu implements Menu{
    ArrayList menuItems;

    public PancakeHouseMenu(){
        menuItems = new ArrayList();

        addItem("K&B's Pancake Breakfast","Pancakes with scrambled eggs,and toast",true,2.99);
        addItem("Regular Pancake Breakfast","Pancakes with fried eggs,sausage",true,2.99);
        addItem("Blueberry Pancake","Pancakes made with fresh blueberries",true,3.49);
        addItem("Waffles","Waffles,with your choice of blueberries or strawberries",true,3.59);
    }

    public void addItem(String name,String description,boolean vegetarian,double price){
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator(){
        return menuItems.iterator();
    }
}
