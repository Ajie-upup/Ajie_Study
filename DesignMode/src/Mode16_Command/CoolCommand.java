package Mode16_Command;

/**
 * @Author: ajie
 * @Date: 2023/1/15
 */
public class CoolCommand implements Command {

    private ConditionReceiver receiver;

    /**
     * 绑定处理请求的接收者
     *
     * @param receiver
     */
    public CoolCommand(ConditionReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("CoolCommand ==> execute");
        receiver.cool();
    }
}
