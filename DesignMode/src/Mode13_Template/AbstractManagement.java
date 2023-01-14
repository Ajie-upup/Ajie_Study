package Mode13_Template;

/**
 * 模板管理类
 *
 * @Author: ajie
 * @Date: 2023/1/14
 */
public abstract class AbstractManagement {

    /**
     * 定义模板方法，final类型，防止子类覆盖，更改流程
     */
    public final void processProject() {
        review();
        design();
        coding();
        test();
        online();
    }

    /**
     * 项目需求评审
     */
    public void review() {
        System.out.println("项目需求评审");
    }

    /**
     * UI UE 进行设计
     */
    public void design() {
        System.out.println("UI UE 进行设计");
    }

    /**
     * 抽象方法，由具体子类进行实现，以编码耗时为例
     */
    public abstract void coding();

    /**
     * 抽象方法，由具体子类实现，测试分为多种，自动化测试，安全测试，压力测试，手工测试
     */
    public abstract void test();

    /**
     * 项目上线方式，全量发布，灰度发布，停机发布
     */
    public abstract void online();
}
