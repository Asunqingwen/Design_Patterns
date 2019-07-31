import java.util.Iterator;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/31 0031 15:14
 */
public class NullIterator implements Iterator {
    @Override
    public Object next() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
