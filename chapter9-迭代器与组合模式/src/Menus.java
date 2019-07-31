import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/31 0031 13:46
 */
public class Menus extends MenuComponent {
    ArrayList menuComponents = new ArrayList();
    String name;
    String description;

    public Menus(String name,String description){
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent)menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------------");

        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            menuComponent.print();
        }
    }

    public Iterator createIterator(){
        return new CompositeIterator(menuComponents.iterator());
    }
}
