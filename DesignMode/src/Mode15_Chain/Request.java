package Mode15_Chain;

/**
 * 具体请求类
 *
 * @Author: ajie
 * @Date: 2023/1/15
 */
public class Request {
    private String requestType;

    private double money;

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
