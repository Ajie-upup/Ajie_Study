package Mode13_Template;

/**
 * @Author: ajie
 * @Date: 2023/1/14
 */
public class UserServiceManagement extends AbstractManagement {
    @Override
    public void coding() {
        System.out.println("编码耗时 10 天");
    }

    @Override
    public void test() {
        System.out.println("自动化测试，安全测试，手工测试");
    }

    @Override
    public void online() {
        System.out.println("全量发布，灰度发布，停机上线");
    }
}
