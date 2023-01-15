package Mode17_Iterator;

import java.util.List;

/**
 * @Author: ajie
 * @Date: 2023/1/15
 */
public class ConcreteMyIterator implements MyIterator {
    private List list;

    private int index = 0;

    public ConcreteMyIterator(List list) {
        this.list = list;
    }

    @Override
    public Object next() {
        Object obj = null;
        if (this.hasNext()) {
            obj = this.list.get(index);
            index++;
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        if (index == list.size()) {
            return false;
        }
        return true;
    }

    @Override
    public Object remove(Object obj) {
        return list.remove(obj);
    }
}
