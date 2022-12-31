package Mode02_Factory.type02_FactoryMethod;

/**
 * 测试工厂方法模式
 *
 * @Author: ajie
 * @Date: 2022/12/29
 */
public class Main {
    public static void main(String[] args) {
        PayFactory aliPayFactory = new AliPayFactory();
        Pay aliPay = aliPayFactory.getPayType();
        aliPay.unifiedorder();

        PayFactory weChatPayFactory = new WeChatPayFactory();
        Pay weChatPay = weChatPayFactory.getPayType();
        weChatPay.unifiedorder();
    }
}
