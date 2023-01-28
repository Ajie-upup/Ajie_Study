package part02_;

/**
 * @Author: ajie
 * @Date: 2023/1/28
 * @Description:
 */
public class FinallyTest {
    public static void main(String[] args) {
        int res = f(2);
        System.out.println(res);
    }

    public static int f(int value) {
        try {
            return value * value;
        } finally {
            if (value == 2) {
                return 0;
            }
        }
    }
}
