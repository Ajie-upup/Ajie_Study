package Mode09_Proxy;

/**
 * 模拟真实厂商，实现卖手机的功能
 *
 * @Author: ajie
 * @Date: 2023/1/13
 */
public class DigitalSellReal implements DigitalSell {
    @Override
    public void sell() {
        System.out.println("卖手机");
    }

}
