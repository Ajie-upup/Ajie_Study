package Mode02_Factory.type03_AbstractFactory.Ali;

import Mode02_Factory.type03_AbstractFactory.PayFactory;

/**
 * @Author: ajie
 * @Date: 2022/12/29
 */
public class AliPay implements PayFactory {
    @Override
    public void unifiedorder() {
        System.out.println("支付宝，统一支付下单");
    }
}
