package Mode17_Iterator;

/**
 * 抽象容器
 *
 * @Author: ajie
 * @Date: 2023/1/15
 */
public interface ICollection {

    void add(Object obj);

    void remove(Object obj);

    MyIterator myIterator();
}
