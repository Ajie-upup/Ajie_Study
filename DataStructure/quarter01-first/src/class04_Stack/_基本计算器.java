package class04_Stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author: ajie
 * @Date: 2023/2/22
 * @Description: https://leetcode.cn/problems/basic-calculator/
 */
public class _基本计算器 {
    public int calculate(String s) {
        Deque<Integer> stack = new LinkedList<Integer>();
        stack.push(1);
        int sign = 1;

        int res = 0;
        int n = s.length();
        int i = 0;
        while (i < n) {
            if (s.charAt(i) == ' ') {
                i++;
            } else if (s.charAt(i) == '+') {
                sign = stack.peek();
                i++;
            } else if (s.charAt(i) == '-') {
                sign = -stack.peek();
                i++;
            } else if (s.charAt(i) == '(') {
                stack.push(sign);
                i++;
            } else if (s.charAt(i) == ')') {
                stack.pop();
                i++;
            } else {
                long num = 0;
                while (i < n && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + s.charAt(i) - '0';
                    i++;
                }
                res += sign * num;
            }
        }
        return res;
    }
}
