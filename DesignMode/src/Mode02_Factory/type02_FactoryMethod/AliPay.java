package Mode02_Factory.type02_FactoryMethod;


/**
 * @Author: ajie
 * @Date: 2022/12/28
 */
public class AliPay implements Pay {
    @Override
    public void unifiedorder() {
        System.out.println("支付宝统一支付下单");
    }
}
