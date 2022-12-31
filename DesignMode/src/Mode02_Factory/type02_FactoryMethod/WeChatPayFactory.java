package Mode02_Factory.type02_FactoryMethod;

/**
 * @Author: ajie
 * @Date: 2022/12/29
 */
public class WeChatPayFactory implements PayFactory {
    @Override
    public Pay getPayType() {
        return new WeChatPay();
    }
}
