package Mode12_Strategy;

/**
 * @Author: ajie
 * @Date: 2023/1/14
 */
public class Main {
    public static void main(String[] args) {
        //简单商品对象
        ProductionOrder order = new ProductionOrder(800, 1, 33);
        //策略声明
        Strategy strategy;
        //上下文声明
        PromotionContext context;
        //最终价格声明
        double finalPrice;

        context = new PromotionContext(new NormalActivity());
        finalPrice = context.executeStrategy(order);
        System.out.println("NormalActivity 下 finalPrice = " + finalPrice);

        context = new PromotionContext(new DiscountActivity(0.8));
        finalPrice = context.executeStrategy(order);
        System.out.println("DiscountActivity 下 finalPrice = " + finalPrice);

        context = new PromotionContext(new VoucherActivity(100));
        finalPrice = context.executeStrategy(order);
        System.out.println("VoucherActivity 下 finalPrice = " + finalPrice);
    }
}
