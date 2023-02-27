package class04_Stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/**
 * @Author: ajie
 * @Date: 2023/2/22
 * @Description: https://leetcode.cn/problems/evaluate-reverse-polish-notation/
 */
public class _逆波兰表达式求值 {

    public static void main(String[] args) {
        String[] tokens = {"4","13","5","/","+"};
        evalRPN(tokens);
    }
    public static int evalRPN(String[] tokens) {
        ArrayList<String> list = new ArrayList<>();
        list.add("+");
        list.add("-");
        list.add("*");
        list.add("/");
        Deque<Integer> stack = new ArrayDeque<>();
        for (String token : tokens) {
            if (list.contains(token)) {
                Integer num1 = stack.pop();
                Integer num2 = stack.pop();
                int res = countValue(num1, num2, token);
                stack.push(res);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    private static int countValue(int num1, int num2, String token) {
        if (token.equals("+")) {
            return num1 + num2;
        }
        if (token.equals("-")) {
            return num2 - num1;
        }
        if (token.equals("*")) {
            return num2 * num1;
        }
        if (token.equals("/")) {
            return num2 / num1;
        }
        return 0;
    }
}
