package Mode09_Proxy;

/**
 * 模拟零售商卖手机，同样实现了卖手机的接口，但在此基础上有功能的拓展
 *
 * @Author: ajie
 * @Date: 2023/1/13
 */
public class DigitalSellProxy implements DigitalSell {

    /**
     * 模拟进货过程，存在的真实厂商
     */
    private DigitalSell realObj = new DigitalSellReal();

    @Override
    public void sell() {
        selectAddress();
        realObj.sell();
        advertise();
    }

    //功能拓展
    private void selectAddress() {
        System.out.println("选取人流量高的地方");
    }

    private void advertise() {
        System.out.println("投放广告，促进销售!");
    }

}
