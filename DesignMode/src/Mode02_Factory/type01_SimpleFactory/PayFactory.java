package Mode02_Factory.type01_SimpleFactory;

/**
 * 支付工厂
 *
 * @Author: ajie
 * @Date: 2022/12/28
 */
public class PayFactory {

    /**
     * 获取支付类的方法
     *
     * @param payType 支付类型
     * @return 对应的支付类
     */
    public static Pay createPayType(String payType) {
        if (payType == null) {
            return null;
        } else if (payType.equalsIgnoreCase("WECHAT_PAY")) {
            return new WeChatPay();
        } else if (payType.equalsIgnoreCase("ALI_PAY")) {
            return new AliPay();
        }
        return null;
    }
}
