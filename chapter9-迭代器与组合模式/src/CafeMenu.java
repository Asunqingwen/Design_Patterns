import java.util.Hashtable;
import java.util.Iterator;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/31 0031 11:28
 */
public class CafeMenu implements Menu{
    Hashtable menuItems = new Hashtable();

    public CafeMenu(){
        addItem("Veggie Burger and Air Fries","Veggie burger on a whole wheat bun,lettuce,tomato,and fries",true,3.99);
        addItem("Soup of the day","A cup of the soup of the day,with a side salad",true,3.69);
        addItem("Burrito","A large burrito,with whole pinto beans,salsa,guacamole",true,4.29);
    }

    public void addItem(String name,String description,boolean vegetarian,double price){
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        menuItems.put(menuItem.getName(),menuItem);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
