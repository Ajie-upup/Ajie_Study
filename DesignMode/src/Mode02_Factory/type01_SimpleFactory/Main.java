package Mode02_Factory.type01_SimpleFactory;

/**
 * @Author: ajie
 * @Date: 2022/12/28
 */
public class Main {
    public static void main(String[] args) {
        Pay wechatPay = PayFactory.createPayType("WECHAT_PAY");
        wechatPay.unifiedorder();

        Pay aliPay = PayFactory.createPayType("ALI_PAY");
        aliPay.unifiedorder();
    }
}
