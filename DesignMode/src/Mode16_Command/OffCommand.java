package Mode16_Command;

/**
 * @Author: ajie
 * @Date: 2023/1/15
 */
public class OffCommand implements Command {

    private ConditionReceiver receiver;

    /**
     * 绑定处理请求的接收者
     *
     * @param receiver
     */
    public OffCommand(ConditionReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("OffCommand ==> execute");
        receiver.off();
    }
}
