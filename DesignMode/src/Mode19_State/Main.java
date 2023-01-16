package Mode19_State;

/**
 * @Author: ajie
 * @Date: 2023/1/16
 */
public class Main {
    public static void main(String[] args) {
        //创建上下文对象
        OrderContext context = new OrderContext();

        //根据不同的状态，处理请求
        context.setState(new NewOrderState());

        context.setState(new PayOrderState());

        context.setState(new SendOrderState());

    }
}
