package Mode16_Command;

/**
 * @Author: ajie
 * @Date: 2023/1/15
 */
public class Main {
    public static void main(String[] args) {
        //创建接收者
        ConditionReceiver receiver = new ConditionReceiver();

        //创建命令对象，设置接收者
        Command onCommand = new OnCommand(receiver);
        Command offCommand = new OffCommand(receiver);
        Command coolCommand = new CoolCommand(receiver);
        Command warmCommand = new WarmCommand(receiver);

        //创建请求者，设置命令对象
        AppInvoker invoker = new AppInvoker();
        invoker.setOnCommand(onCommand);
        invoker.setOffCommand(offCommand);
        invoker.setCoolCommand(coolCommand);
        invoker.setWarmCommand(warmCommand);

        //调用执行方法
        invoker.on();
        invoker.cool();
        invoker.warm();
        invoker.off();


    }
}
