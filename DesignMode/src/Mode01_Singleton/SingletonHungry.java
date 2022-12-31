package Mode01_Singleton;

/**
 * 单例设计模式：饿汉式
 *
 * @Author: ajie
 * @Date: 2022/12/27
 */
public class SingletonHungry {

    private static SingletonHungry instance = new SingletonHungry();

    private SingletonHungry() {

    }

    public static SingletonHungry getInstance() {
        return instance;
    }

    /**
     * 单例对象的方法
     */
    public void process() {
        System.out.println("SingletonHungry 饿汉式 方法被调用了！");
    }


}
