package Mode12_Strategy;

/**
 * 订单对象
 *
 * @Author: ajie
 * @Date: 2023/1/14
 */
public class ProductionOrder {

    private double oldPrice;
    private int userId;
    private int productId;

    public ProductionOrder(double oldPrice, int userId, int productId) {
        this.oldPrice = oldPrice;
        this.userId = userId;
        this.productId = productId;
    }

    public double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(double oldPrice) {
        this.oldPrice = oldPrice;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
