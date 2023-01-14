package Mode14_Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主体，引入观察者
 *
 * @Author: ajie
 * @Date: 2023/1/14
 */
public abstract class Subject {

    private List<Observer> observerList = new ArrayList<>();

    /**
     * 添加观察者
     *
     * @param observer
     */
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    /**
     * 删除观察者
     *
     * @param observer
     */
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    /**
     * 监听事件，唤醒观察者
     */
    public void notifyAllObserver() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }


}
