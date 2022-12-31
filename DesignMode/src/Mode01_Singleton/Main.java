package Mode01_Singleton;

/**
 * 测试单例模式
 *
 * @Author: ajie
 * @Date: 2022/12/27
 */
public class Main {
    public static void main(String[] args) {
        //懒汉式
        SingletonLazy.getInstance().process();
        //Desktop

        //饿汉式
        SingletonHungry.getInstance().process();

        //Runtime
    }
}
