package Mode02_Factory.type03_AbstractFactory.WeChat;

import Mode02_Factory.type03_AbstractFactory.PayFactory;

/**
 * @Author: ajie
 * @Date: 2022/12/29
 */
public class WeChatPay implements PayFactory {
    @Override
    public void unifiedorder() {
        System.out.println("微信，统一支付下单");
    }
}
