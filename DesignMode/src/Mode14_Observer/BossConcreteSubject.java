package Mode14_Observer;

/**
 * @Author: ajie
 * @Date: 2023/1/14
 */
public class BossConcreteSubject extends Subject {

    public void notifyObserver() {
        System.out.println("完成老板工作");
        System.out.println("老板去工作间观察员工工作状态");
        super.notifyAllObserver();
    }
}
