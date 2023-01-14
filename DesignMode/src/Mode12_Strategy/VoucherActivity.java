package Mode12_Strategy;

/**
 * @Author: ajie
 * @Date: 2023/1/14
 */
public class VoucherActivity extends Strategy {

    private double voucher;

    public VoucherActivity(double voucher) {
        this.voucher = voucher;
    }

    @Override
    public double calculatePrice(ProductionOrder order) {

        //一系列复杂的计算步骤
        if (order.getOldPrice() - voucher > 0) {
            return order.getOldPrice() - voucher;
        } else {
            return 0;
        }
    }
}
