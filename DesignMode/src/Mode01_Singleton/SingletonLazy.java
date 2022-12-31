package Mode01_Singleton;


/**
 * 单例设计模式 - 懒汉式
 *
 * @Author: ajie
 * @Date: 2022/12/27
 */
public class SingletonLazy {
//    public static SingletonLazy instance;

    private SingletonLazy() {
    }

    /**
     * 单例对象的方法
     */
    public void process() {
        System.out.println("SingletonLazy 懒汉式 方法被调用了！");
    }

    /**
     * 第一种方式：对外暴露一个获取类对象的方法
     * <p>
     * 线程不安全，多线程下存在安全问题
     *
     * @return
     */
//    public static SingletonLazy getInstance() {
//        if (instance == null) {
//            instance = new SingletonLazy();
//        }
//        return instance;
//    }

    /**
     * 第二种方式：通过加锁 synchronized 实现单例
     * <p>
     * 采用 synchronized 直接对方法加锁有很大的性能开销
     * <p>
     * 解决办法：锁粒度不要那么大
     *
     * @return
     */
//    public static synchronized SingletonLazy getInstance() {
//        if (instance == null) {
//            instance = new SingletonLazy();
//        }
//        return instance;
//    }

    /**
     * 第三种方式：DCL 双向检查锁定(Double-checked-Locking)，在多线程情况下保持高性能
     * <p>
     * 不安全：instance = new SingletonLazy();并不是原子性操作
     * 创建对象的步骤：
     * 1、分配空间给对象
     * 2、在空间内创建对象
     * 3、将对象赋值给引用 instance
     * <p>
     * 存在指令重排的问题：
     * 假如线程按照 1 -> 3 -> 2 的顺序创建对象，会把值写入主内存，其他线程就会读取到 instance 最新值，但是这个不是完整的对象
     *
     * @return
     */
//    public static SingletonLazy getInstance() {
//        if (instance == null) {
//            synchronized (SingletonLazy.class) {
//                if (instance == null) {
//                    instance = new SingletonLazy();
//                }
//            }
//        }
//        return instance;
//    }

    /**
     * 第四种方式：volatile 是Java提供的关键字，它具有可见性和有序性
     * <p>
     * 指令重排是 JVM 对语句执行的优化，只要语句间没有依赖，那 JVM就有权对语句进行优化
     *
     * @return
     */
    private static volatile SingletonLazy instance;

    public static SingletonLazy getInstance() {
        //第一重检查
        if (instance == null) {
            //A、B锁定
            synchronized (SingletonLazy.class) {
                if (instance == null) {
                    //第二重检查
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }
}
