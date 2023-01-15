package Mode15_Chain;

/**
 * 责任链模式
 *
 * @Author: ajie
 * @Date: 2023/1/15
 */
public class Main {
    public static void main(String[] args) {
        //创建风险防控责任链
        RiskControllerManager firstRiskControllerManager = new FirstRiskControllerManager("第一级防控");
        RiskControllerManager secondRiskControllerManager = new SecondRiskControllerManager("第二级防控");
        RiskControllerManager thirdRiskControllerManager = new ThirdRiskControllerManager("第三级防控");

        firstRiskControllerManager.setSuperior(secondRiskControllerManager);
        secondRiskControllerManager.setSuperior(thirdRiskControllerManager);

        //模拟请求
        Request request = new Request();
        request.setRequestType(RequestType.TRANSFER.name());
        request.setMoney(10000);

        firstRiskControllerManager.handlerRequest(request);
    }
}
