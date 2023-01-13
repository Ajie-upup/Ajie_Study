package Mode10_Facade;

/**
 * @Author: ajie
 * @Date: 2023/1/13
 */
public class Main {
    public static void main(String[] args) {
        Imessage allPush = new MessageFacade();
        allPush.pushMessage();
    }
}
