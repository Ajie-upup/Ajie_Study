package Mode02_Factory.type03_AbstractFactory.Ali;

import Mode02_Factory.type03_AbstractFactory.RefundFactory;

/**
 * @Author: ajie
 * @Date: 2022/12/29
 */
public class AliReFund implements RefundFactory {
    @Override
    public void refund() {
        System.out.println("支付宝，统一退款");
    }
}
