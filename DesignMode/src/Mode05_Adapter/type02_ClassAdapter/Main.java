package Mode05_Adapter.type02_ClassAdapter;

/**
 * 类的适配器测试
 *
 * @Author: ajie
 * @Date: 2023/1/9
 */
public class Main {
    public static void main(String[] args) {
        TargetModule targetModule = new Adapter();

        targetModule.methodA();
        targetModule.methodB();
        targetModule.methodC();

    }
}
