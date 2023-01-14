package Mode12_Strategy;

/**
 * 计算商品价格的抽象策略
 *
 * @Author: ajie
 * @Date: 2023/1/14
 */
public abstract class Strategy {
    /**
     * 根据订单对象计算商品的折扣价格
     *
     * @param order
     * @return
     */
    public abstract double calculatePrice(ProductionOrder order);
}
