package Mode17_Iterator;

/**
 * 抽象迭代器
 *
 * @Author: ajie
 * @Date: 2023/1/15
 */
public interface MyIterator {
    /**
     * 获取下一个元素
     *
     * @return
     */
    Object next();

    /**
     * 判断是否有下一个元素
     *
     * @return
     */
    boolean hasNext();

    /**
     * 删除元素
     *
     * @param obj
     * @return
     */
    Object remove(Object obj);
}
