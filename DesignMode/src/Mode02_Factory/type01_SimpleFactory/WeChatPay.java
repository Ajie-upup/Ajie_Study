package Mode02_Factory.type01_SimpleFactory;

/**
 * @Author: ajie
 * @Date: 2022/12/28
 */
public class WeChatPay implements Pay{
    @Override
    public void unifiedorder() {
        System.out.println("微信统一支付下单");
    }
}
