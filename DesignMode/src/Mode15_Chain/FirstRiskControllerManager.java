package Mode15_Chain;

/**
 * @Author: ajie
 * @Date: 2023/1/15
 */
public class FirstRiskControllerManager extends RiskControllerManager {

    public FirstRiskControllerManager(String name) {
        super(name);
    }

    @Override
    public void handlerRequest(Request request) {
        if (RequestType.valueOf(request.getRequestType()) != null && request.getMoney() <= 1000) {
            System.out.println("小金额操作，输入支付密码即可");
            System.out.println(name + ":" + request.getRequestType() + ",金额:" + request.getMoney() + " 处理完成");
        } else {
            //如果超出该级风险防控，交由下一级处理
            if (superior != null) {
                superior.handlerRequest(request);
            }
        }
    }
}
