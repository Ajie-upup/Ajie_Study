package Mode15_Chain;

/**
 * @Author: ajie
 * @Date: 2023/1/15
 */
public abstract class RiskControllerManager {

    protected String name;

    /**
     * 下一级风控策略
     */
    protected RiskControllerManager superior;

    public RiskControllerManager(String name) {
        this.name = name;
    }

    /**
     * 设置下一级风控策略
     *
     * @param superior
     */
    public void setSuperior(RiskControllerManager superior) {
        this.superior = superior;
    }

    /**
     * 处理请求方法
     *
     * @param request
     */
    public abstract void handlerRequest(Request request);

}
