package Mode19_State;

/**
 * 新建订单状态
 *
 * @Author: ajie
 * @Date: 2023/1/16
 */
public class NewOrderState implements State {
    @Override
    public void handle() {
        System.out.println("客户新建订单 ====> 调用客户服务\n");
    }
}
