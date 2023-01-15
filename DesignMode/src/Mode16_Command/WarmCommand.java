package Mode16_Command;

/**
 * @Author: ajie
 * @Date: 2023/1/15
 */
public class WarmCommand implements Command {

    private ConditionReceiver receiver;

    /**
     * 绑定处理请求的接收者
     *
     * @param receiver
     */
    public WarmCommand(ConditionReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("WarmCommand ==> execute");
        receiver.warm();
    }
}
