package Mode06_Bridging;

/**
 * @Author: ajie
 * @Date: 2023/1/9
 */
public class Main {
    public static void main(String[] args) {
        HWPhone blueHWPhone = new HWPhone(new BlueColor());
        blueHWPhone.run();

        HWPhone yellowHWPhone = new HWPhone(new YellowColor());
        yellowHWPhone.run();

        HWPhone redHWPhone = new HWPhone(new RedColor());
        redHWPhone.run();
    }
}
