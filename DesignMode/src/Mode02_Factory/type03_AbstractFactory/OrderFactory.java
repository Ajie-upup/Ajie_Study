package Mode02_Factory.type03_AbstractFactory;

/**
 * @Author: ajie
 * @Date: 2022/12/29
 */
public interface OrderFactory {
    PayFactory createPay();

    RefundFactory createRefund();
}
