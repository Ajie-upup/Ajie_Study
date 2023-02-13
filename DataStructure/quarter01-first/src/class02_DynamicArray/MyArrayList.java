package class02_DynamicArray;

import java.util.ArrayList;

/**
 * 自身实现 ArrayList 与源码比较
 *
 * @Author: ajie
 * @Date: 2023/1/8
 */
public class MyArrayList<E> {
    ArrayList<Integer> list = new ArrayList<>();
    /**
     * 元素的数量
     */
    private int size;

    /**
     * 元素的存储位置
     */
    private E[] elements;

    /**
     * 默认存储容量
     */
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * 元素不存在返回值
     */
    private static final int ELEMENT_NOT_FOUND = -1;

    public MyArrayList(int initialCapacity) {
        initialCapacity = (initialCapacity < DEFAULT_CAPACITY) ? DEFAULT_CAPACITY : initialCapacity;
        elements = (E[]) new Object[initialCapacity];
    }

    public MyArrayList() {
        this(DEFAULT_CAPACITY);
    }

    private void outOfBounds(int index) {
        throw new IndexOutOfBoundsException("Index: " + index + ", size: " + size);
    }

    /**
     * index 是否越界
     *
     * @param index
     */
    private void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            outOfBounds(index);
        }
    }

    /**
     * 添加操作时的 index 是否越界
     *
     * @param index
     */
    private void rangeCheckForAdd(int index) {
        if (index < 0 || index > size) {
            outOfBounds(index);
        }
    }

    /**
     * 元素的数量
     *
     * @return
     */
    public int size() {
        return size;
    }

    /**
     * 数组元素是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 是否包含某个元素
     *
     * @param element
     * @return
     */
    public boolean contains(E element) {
        //判断数组元素下标是否存在
        return indexOf(element) >= 0;
    }

    /**
     * 根据元素的值获取元素下标
     *
     * @param element
     * @return
     */
    public int indexOf(E element) {
        if (element == null) {
            // 如果查找的元素值为 null,返回第一个为 null 的数组元素
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) {
                    return i;
                }
            }
        } else {
            // 如果查找的元素值不为 null,返回数组元素下标
            for (int i = 0; i < size; i++) {
                if (element.equals(elements[i])) {
                    return i; // n
                }
            }
        }
        //元素不存在时的返回
        return ELEMENT_NOT_FOUND;
    }

    /**
     * 获取index位置的元素
     *
     * @param index
     * @return
     */
    public E get(int index) {
        rangeCheck(index);
        return elements[index];
    }

    /**
     * 设置index位置的元素
     *
     * @param index
     * @param element
     * @return
     */
    public E set(int index, E element) {
        rangeCheck(index);

        E oldValue = elements[index];
        elements[index] = element;
        return oldValue;
    }

    /**
     * 添加元素到尾部
     *
     * @param element
     */
    public void add(E element) {
        add(size, element);
    }



    /**
     * 在index位置插入一个元素
     *
     * @param index
     * @param element
     */
    public void add(int index, E element) {
        rangeCheckForAdd(index);

        ensureCapacity(size + 1);

//        System.arraycopy(elements, index, elements, index + 1,
//                size - index);
        // 将 index 后的元素全部向后移动 1
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        // 将需要添加的元素赋值给 elements[index]
        elements[index] = element;
        size++;
    }

    /**
     * 删除index位置的元素
     *
     * @param index
     * @return
     */
    public E remove(int index) {
        rangeCheck(index);

        E oldValue = elements[index];
        // 将 index 后的元素全部向前移动 1
        for (int i = index + 1; i < size; i++) {
            elements[i - 1] = elements[i];
        }
        elements[--size] = null;
        return oldValue;
    }


    /**
     * 清除所有元素
     */
    public void clear() {
        //将元素置空后交给 GC 回收
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }



    /**
     * 保证容量大小符合要求
     *
     * @param capacity
     */
    private void ensureCapacity(int capacity) {
        int oldCapacity = elements.length;
        if (oldCapacity >= capacity) {
            return;
        }
        //旧容量的1.5倍
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        E[] newElements = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;

        System.out.println(oldCapacity + "扩容为" + newCapacity);
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("size= ").append(size).append(", [");
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(elements[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
