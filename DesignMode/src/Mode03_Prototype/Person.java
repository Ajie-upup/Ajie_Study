package Mode03_Prototype;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 原型设计模式的原型类
 *
 * @Author: ajie
 * @Date: 2022/12/30
 */
public class Person implements Cloneable, Serializable {
    private String name;

    private int age;

    private List<String> list = new ArrayList<>();

    public Person() {
        System.out.println("创建了一个 Person 对象");
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 浅拷贝 --- 克隆类的方法
     * 将 Object 转换成 Person
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }

    /**
     * 深拷贝
     *
     * @return
     */
    public Object deepClone() {
        try {
            //输出 序列化
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);

            //输入 反序列化
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            Object copyObj = (Person) ois.readObject();

            return copyObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
