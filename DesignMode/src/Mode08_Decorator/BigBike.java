package Mode08_Decorator;

/**
 * @Author: ajie
 * @Date: 2023/1/12
 */
public class BigBike implements Bike {
    private String description = "大号自行车";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getPrice() {
        return 200;
    }
}
