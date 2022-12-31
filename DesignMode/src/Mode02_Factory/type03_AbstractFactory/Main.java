package Mode02_Factory.type03_AbstractFactory;

/**
 * @Author: ajie
 * @Date: 2022/12/29
 */
public class Main {
    public static void main(String[] args) {
        OrderFactory wechatOrderFactory = FactoryProducer.createFactory("WECHAT");
        wechatOrderFactory.createPay().unifiedorder();
        wechatOrderFactory.createRefund().refund();

        OrderFactory aliOrderFactory = FactoryProducer.createFactory("ALI");
        aliOrderFactory.createPay().unifiedorder();
        aliOrderFactory.createRefund().refund();
    }
}
