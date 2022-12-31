package Mode02_Factory.type03_AbstractFactory.WeChat;

import Mode02_Factory.type03_AbstractFactory.RefundFactory;

/**
 * @Author: ajie
 * @Date: 2022/12/29
 */
public class WeChatRefund implements RefundFactory {
    @Override
    public void refund() {
        System.out.println("微信，统一退款");
    }
}
