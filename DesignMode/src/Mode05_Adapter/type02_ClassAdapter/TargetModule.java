package Mode05_Adapter.type02_ClassAdapter;

/**
 * 拓展方法后的目标类
 *
 * @Author: ajie
 * @Date: 2023/1/9
 */
public interface TargetModule {
    /**
     * 和原始类中方法一致的方法
     */
    void methodA();

    /**
     * 需要拓展的方法，可以包含多个
     */
    void methodB();

    void methodC();

}
