package Mode06_Bridging;

/**
 * @Author: ajie
 * @Date: 2023/1/9
 */
public class SXPhone extends Phone {
    public SXPhone(Color color) {
        super.setColor(color);
    }

    @Override
    void run() {
        color.useColor();
        System.out.println("SXPhone");
    }
}
