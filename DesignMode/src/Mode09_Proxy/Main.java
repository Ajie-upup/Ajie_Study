package Mode09_Proxy;

/**
 * 模拟厂家进货，代理销售的过程
 *
 * @Author: ajie
 * @Date: 2023/1/13
 */
public class Main {
    public static void main(String[] args) {
        DigitalSell realSell = new DigitalSellReal();
        realSell.sell();

        System.out.println("========================");

        DigitalSell proxySell = new DigitalSellProxy();
        proxySell.sell();
    }
}
