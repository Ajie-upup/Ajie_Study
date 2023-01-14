package Mode14_Observer;

/**
 * @Author: ajie
 * @Date: 2023/1/14
 */
public class Main {
    public static void main(String[] args) {
        //创建一个主题，老板
        BossConcreteSubject bossSubject = new BossConcreteSubject();

        //创建观察者对象
        Observer lwObserver = new LWConcreteObserver();
        Observer llObserver = new LLConcreteObserver();

        //添加对应关系，老板这个主题被员工观察
        bossSubject.addObserver(lwObserver);
        bossSubject.addObserver(llObserver);

        //主题开始活动，就会通知观察者（相当于发布消息）
        bossSubject.notifyObserver();
    }
}
