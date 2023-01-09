package Mode05_Adapter.type01_InterfaceAdapter;

import Mode05_Adapter.type01_InterfaceAdapter.PayGatewayAdapter;

/**
 * @Author: ajie
 * @Date: 2023/1/9
 */
public class ProductVipOder extends PayGatewayAdapter {

    @Override
    public void unifiedorder() {
        System.out.println("ProductVipOder 统一下单支付");
    }

    @Override
    public void refund() {
        System.out.println("ProductVipOder 统一退款");
    }

    @Override
    public void sendRedPack() {
        System.out.println("ProductVipOder 发红包");
    }
}
