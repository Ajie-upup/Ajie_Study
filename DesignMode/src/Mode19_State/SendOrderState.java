package Mode19_State;

/**
 * 物流状态
 *
 * @Author: ajie
 * @Date: 2023/1/16
 */
public class SendOrderState implements State {
    @Override
    public void handle() {
        System.out.println("商家完成打包派送 ====> 等待客户签收\n");
    }
}
