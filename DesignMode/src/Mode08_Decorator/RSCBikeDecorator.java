package Mode08_Decorator;

/**
 * @Author: ajie
 * @Date: 2023/1/12
 */
public class RSCBikeDecorator extends BikeDecorator {

    private String description = "增加了一个防爆胎";

    private Bike bike;

    public RSCBikeDecorator(Bike bike) {
        this.bike = bike;
    }

    @Override
    public String getDescription() {
        return bike.getDescription() + "," + description;
    }

    @Override
    public int getPrice() {
        return bike.getPrice() + 100;
    }
}
