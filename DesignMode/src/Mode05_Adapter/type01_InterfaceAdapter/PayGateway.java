package Mode05_Adapter.type01_InterfaceAdapter;

/**
 * 支付网关接口
 *
 * @Author: ajie
 * @Date: 2023/1/9
 */
public interface PayGateway {
    /**
     * 下单
     */
    void unifiedorder();

    /**
     * 退款
     */
    void refund();

    /**
     * 查询支付状态
     */
    void query();

    /**
     * 发红包
     */
    void sendRedPack();
}
