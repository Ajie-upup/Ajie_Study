package Mode17_Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ajie
 * @Date: 2023/1/15
 */
public class MyCollection implements ICollection {

    private List list = new ArrayList<>();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public MyIterator myIterator() {
        return new ConcreteMyIterator(list);
    }
}
