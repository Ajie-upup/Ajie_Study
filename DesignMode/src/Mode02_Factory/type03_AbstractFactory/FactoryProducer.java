package Mode02_Factory.type03_AbstractFactory;

import Mode02_Factory.type03_AbstractFactory.Ali.AliOrderFactory;
import Mode02_Factory.type03_AbstractFactory.WeChat.WeChatOrderFactory;

/**
 * @Author: ajie
 * @Date: 2022/12/29
 */
public class FactoryProducer {

    public static OrderFactory createFactory(String factoryType) {
        if (factoryType == null) {
            return null;
        } else if (factoryType.equalsIgnoreCase("WECHAT")) {
            return new WeChatOrderFactory();
        } else if (factoryType.equalsIgnoreCase("ALI")) {
            return new AliOrderFactory();
        }
        return null;
    }
}
