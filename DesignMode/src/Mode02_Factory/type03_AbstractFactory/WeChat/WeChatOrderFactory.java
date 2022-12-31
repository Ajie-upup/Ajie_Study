package Mode02_Factory.type03_AbstractFactory.WeChat;

import Mode02_Factory.type03_AbstractFactory.OrderFactory;
import Mode02_Factory.type03_AbstractFactory.PayFactory;
import Mode02_Factory.type03_AbstractFactory.RefundFactory;

/**
 * @Author: ajie
 * @Date: 2022/12/29
 */
public class WeChatOrderFactory implements OrderFactory {
    @Override
    public PayFactory createPay() {
        return new WeChatPay();
    }

    @Override
    public RefundFactory createRefund() {
        return new WeChatRefund();
    }
}
