package Mode12_Strategy;

/**
 * @Author: ajie
 * @Date: 2023/1/14
 */
public class PromotionContext {

    private Strategy strategy;

    public PromotionContext(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 根据用户选择的策略计算商品的价格
     *
     * @param order
     * @return
     */
    public double executeStrategy(ProductionOrder order) {
        return strategy.calculatePrice(order);
    }


}
