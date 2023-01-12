package Mode08_Decorator;

/**
 * @Author: ajie
 * @Date: 2023/1/12
 */
public class SuonaBikeDecorator extends BikeDecorator {

    private String description = "增加了一个唢呐";

    private Bike bike;

    public SuonaBikeDecorator(Bike bike) {
        this.bike = bike;
    }

    @Override
    public String getDescription() {
        return bike.getDescription() + "," + description;
    }

    @Override
    public int getPrice() {
        return bike.getPrice() + 50;
    }
}
