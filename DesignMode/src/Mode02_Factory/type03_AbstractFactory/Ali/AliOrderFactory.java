package Mode02_Factory.type03_AbstractFactory.Ali;

import Mode02_Factory.type03_AbstractFactory.OrderFactory;
import Mode02_Factory.type03_AbstractFactory.PayFactory;
import Mode02_Factory.type03_AbstractFactory.RefundFactory;

/**
 * @Author: ajie
 * @Date: 2022/12/29
 */
public class AliOrderFactory implements OrderFactory {
    @Override
    public PayFactory createPay() {
        return new AliPay();
    }

    @Override
    public RefundFactory createRefund() {
        return new AliReFund();
    }
}
