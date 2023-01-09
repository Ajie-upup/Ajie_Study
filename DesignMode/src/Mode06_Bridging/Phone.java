package Mode06_Bridging;

/**
 * 抽象手机对象
 *
 * @Author: ajie
 * @Date: 2023/1/9
 */
public abstract class Phone {

    /**
     * 通过组合的方式来桥接其他行为
     */
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    abstract void run();
}
