package Mode10_Facade;

/**
 * @Author: ajie
 * @Date: 2023/1/13
 */
public class SmsMessage implements Imessage {
    @Override
    public void pushMessage() {
        System.out.println("推送短信消息");
    }
}
