import java.util.ArrayList;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/31 0031 10:01
 */
public class PancakeHouseIterator implements Iterator {
    ArrayList items;
    int position = 0;

    public PancakeHouseIterator(ArrayList items){
        this.items =items;
    }

    public Object next(){
        MenuItem menuItem = (MenuItem) items.get(position);
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext(){
        return position < items.size() && items.get(position) != null;
    }
}
