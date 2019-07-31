import java.util.Iterator;
import java.util.Stack;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/31 0031 14:05
 */
public class CompositeIterator implements Iterator {
    Stack stack = new Stack();

    public CompositeIterator(Iterator iterator){
        stack.push(iterator);
    }

    @Override
    public Object next() {
        if (hasNext()){
            Iterator iterator = (Iterator)stack.peek();
            MenuComponent component = (MenuComponent)iterator.next();
            if(component instanceof Menus){
                stack.push(component.createIterator());
            }
            return component;
        }else {
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        if(stack.empty()){
            return false;
        }else {
            Iterator iterator = (Iterator)stack.peek();
            if(!iterator.hasNext()){
                stack.pop();
                return hasNext();
            }else {
                return true;
            }
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
