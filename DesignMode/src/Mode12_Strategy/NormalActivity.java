package Mode12_Strategy;

/**
 * 无活动：正常价格
 *
 * @Author: ajie
 * @Date: 2023/1/14
 */
public class NormalActivity extends Strategy {
    @Override
    public double calculatePrice(ProductionOrder order) {
        return order.getOldPrice();
    }
}
