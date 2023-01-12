package Mode08_Decorator;

/**
 * @Author: ajie
 * @Date: 2023/1/12
 */
public class Main {
    public static void main(String[] args) {
        Bike bigBike = new BigBike();

        bigBike = new RSCBikeDecorator(bigBike);
        bigBike = new SuonaBikeDecorator(bigBike);

        System.out.println(bigBike.getDescription() + "，价格：" + bigBike.getPrice() + "元");

    }
}
