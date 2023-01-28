package part01_;

/**
 * @Author: ajie
 * @Date: 2023/1/28
 * @Description: 探究引用传递
 */
public class code03_ {
    public static void main(String[] args) {
        Student s1 = new Student("⼩张");
        Student s2 = new Student("⼩李");
        swap(s1, s2);
        System.out.println("s1:" + s1.getName());
        System.out.println("s2:" + s2.getName());
    }

    public static void swap(Student x, Student y) {
        Student temp = x;
        x = y;
        y = temp;
        System.out.println("x:" + x.getName());
        System.out.println("y:" + y.getName());
    }
}
