package Mode08_Decorator;

/**
 * @Author: ajie
 * @Date: 2023/1/12
 */
public class BikeDecorator implements Bike {

    private String description = "我只是一个装饰器";

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
