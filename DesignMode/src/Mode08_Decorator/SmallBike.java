package Mode08_Decorator;

/**
 * @Author: ajie
 * @Date: 2023/1/12
 */
public class SmallBike implements Bike {

    private String description = "小号自行车";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getPrice() {
        return 100;
    }
}
