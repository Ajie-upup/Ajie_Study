package Mode12_Strategy;

/**
 * @Author: ajie
 * @Date: 2023/1/14
 */
public class DiscountActivity extends Strategy {

    /**
     * 折扣比例
     */
    private double rate;

    public DiscountActivity(double rate) {
        this.rate = rate;
    }

    @Override
    public double calculatePrice(ProductionOrder order) {
        return order.getOldPrice() * rate;
    }
}
