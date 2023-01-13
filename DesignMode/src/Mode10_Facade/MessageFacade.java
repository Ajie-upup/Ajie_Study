package Mode10_Facade;

/**
 * 外观类：封装具体实现，等待外部调用
 *
 * @Author: ajie
 * @Date: 2023/1/13
 */
public class MessageFacade implements Imessage {

    private Imessage weChatMessage = new WeChatMessage();
    private Imessage smsMessage = new SmsMessage();
    private Imessage mailMessage = new MailMessage();

    @Override
    public void pushMessage() {
        weChatMessage.pushMessage();
        smsMessage.pushMessage();
        mailMessage.pushMessage();
        System.out.println("所有消息推送成功!");
    }
}
