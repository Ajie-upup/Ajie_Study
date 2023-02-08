package class01_;

/**
 * @Author: ajie
 * @Date: 2023/2/7
 * @Description: 验证回文串
 * https://leetcode.cn/problems/valid-palindrome/description/
 */
public class code01_验证回文串 {

    public static void main(String[] args) {
        //0P
        String s = " ";
        boolean palindrome = isPalindrome(s);
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString().equals(sb.reverse().toString());
    }
}
