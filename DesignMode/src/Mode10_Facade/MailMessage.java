package Mode10_Facade;

/**
 * @Author: ajie
 * @Date: 2023/1/13
 */
public class MailMessage implements Imessage {
    @Override
    public void pushMessage() {
        System.out.println("推送邮件消息");
    }
}
