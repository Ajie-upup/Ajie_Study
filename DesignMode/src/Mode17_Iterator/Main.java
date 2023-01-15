package Mode17_Iterator;

/**
 * @Author: ajie
 * @Date: 2023/1/15
 */
public class Main {
    public static void main(String[] args) {
        //创建集合容器
        ICollection collection = new MyCollection();
        collection.add("abc");
        collection.add("cba");
        collection.add("bad");

        MyIterator myIterator = collection.myIterator();

        while (myIterator.hasNext()) {
            Object obj = myIterator.next();
            System.out.println(obj);
        }
    }
}
