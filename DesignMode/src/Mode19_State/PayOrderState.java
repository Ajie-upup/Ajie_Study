package Mode19_State;

/**
 * 支付状态
 *
 * @Author: ajie
 * @Date: 2023/1/16
 */
public class PayOrderState implements State {
    @Override
    public void handle() {
        System.out.println("客户完成支付 ====> 调用物流服务\n");
    }
}
