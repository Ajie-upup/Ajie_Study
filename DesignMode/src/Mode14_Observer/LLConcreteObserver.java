package Mode14_Observer;

/**
 * @Author: ajie
 * @Date: 2023/1/14
 */
public class LLConcreteObserver implements Observer{
    @Override
    public void update() {
        System.out.println("老李发现老板视察，停止摸鱼，正常工作");
    }
}
