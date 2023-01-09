package Mode05_Adapter.type01_InterfaceAdapter;

/**
 * @Author: ajie
 * @Date: 2023/1/9
 */
public class ProductVideoOder extends PayGatewayAdapter {
    @Override
    public void unifiedorder() {
        System.out.println("ProductVideoOder 统一下单支付");
    }

    @Override
    public void refund() {
        System.out.println("ProductVideoOder 统一退款");
    }
}
