package Mode05_Adapter.type02_ClassAdapter;

/**
 * 适配旧的方法，实现新的方法
 *
 * @Author: ajie
 * @Date: 2023/1/9
 */
public class Adapter extends OldModule implements TargetModule {
    @Override
    public void methodB() {
        System.out.println("Adapter methodB");
    }

    @Override
    public void methodC() {
        System.out.println("Adapter methodC");
    }
}
