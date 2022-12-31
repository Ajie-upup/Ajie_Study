package Mode03_Prototype;

/**
 * 客户端
 *
 * @Author: ajie
 * @Date: 2022/12/30
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();

        person1.setName("ajie");
        person1.setAge(20);
        person1.getList().add("aaa");

        //无论是深拷贝还是浅拷贝，构建对象的方法都不会被调用

        Person person2 = person1.clone();
        person2.setName("ajieClone");
        //浅拷贝 克隆对象地址 person1 和 person2 对象地址是同一个
        person2.getList().add("bbb");

        Person person3 = (Person) person1.deepClone();
        person3.setName("ajieDeepClone");
        person3.getList().add("ccc");


        System.out.println("person1.name = " + person1.getName() + "person1.age = " + person1.getAge());
        System.out.println("person2.name = " + person2.getName() + "person2.age = " + person2.getAge());
        System.out.println("person3.name = " + person3.getName() + "person3.age = " + person3.getAge());

    }
}
