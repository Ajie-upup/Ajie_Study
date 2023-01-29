package part01_;

/**
 * @Author: ajie
 * @Date: 2023/1/29
 * @Description: 统计星号
 * https://leetcode.cn/problems/count-asterisks/
 */
public class Day03_ {
    public static void main(String[] args) {
        String s = "l|*e*et|c**o|*de|";
//        String s = "yo|uar|e**|b|e***au|tifu|l";
        System.out.println(countAsterisks(s));
    }

    public static int countAsterisks(String s) {
        int flag = 0, count = 0;
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == '|') {
                flag++;
                continue;
            }
            if ((flag & 1) != 0) {
                continue;
            }

            if (c == '*') {
                count++;
            }
        }

        return count;
    }

    /*
    private static int count = 0;

    public static int countAsterisks(String s) {
        String[] split = s.split("\\|");
        for (int i = 0; i < split.length; i++) {
            if ((i & 1) == 0) {
                countStar(split[i]);
            }
        }
        return count;
    }

    public static void countStar(String split) {
        for (int i = 0; i < split.length(); i++) {
            if (split.charAt(i) == '*') {
                count++;
            }
        }
    }
     */


}
