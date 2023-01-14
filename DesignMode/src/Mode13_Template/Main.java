package Mode13_Template;

/**
 * @Author: ajie
 * @Date: 2023/1/14
 */
public class Main {
    public static void main(String[] args) {
        AbstractManagement management;

        management = new PayServiceManagement();
        management.processProject();

        System.out.println("==================");
        management = new UserServiceManagement();
        management.processProject();
    }
}
