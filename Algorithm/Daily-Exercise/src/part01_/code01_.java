package part01_;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: ajie
 * @Date: 2023/1/27
 * @Description: 兼具大小写的最好英文字母
 * https://leetcode.cn/problems/greatest-english-letter-in-upper-and-lower-case/
 */
public class code01_ {
    public static void main(String[] args) {
        String s = "arRAzFif";
        String res = greatestLetter(s);
        System.out.println(res);
    }


    public static String greatestLetter(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        for (int i = 25; i >= 0; i--) {
            if (set.contains((char) ('a' + i)) && set.contains((char) ('A' + i))) {
                return (char) ('A' + i) + "";
            }
        }
        return "";
    }

}
