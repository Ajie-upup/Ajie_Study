package Mode19_State;

/**
 * 上下文状态，根据不同的状态，调用不同的服务
 *
 * @Author: ajie
 * @Date: 2023/1/16
 */
public class OrderContext {

    private State state;

    public OrderContext() {
    }

    /**
     * 调用服务，处理请求
     *
     * @param state
     */
    public void setState(State state) {
        System.out.println("订单状态发生变更！！");
        this.state = state;
        this.state.handle();
    }
}
