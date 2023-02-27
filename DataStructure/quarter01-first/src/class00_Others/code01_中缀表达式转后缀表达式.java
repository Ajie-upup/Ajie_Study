package class00_Others;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @Author: ajie
 * @Date: 2023/2/27
 * @Description:
 */
public class code01_中缀表达式转后缀表达式 {
    public static void main(String[] args) {
        String medium = "a+b*c+(d*e+f)*g";
        String end = mediumToEnd(medium);
        System.out.println(end);
    }


    private static Map<Character, Integer> map = new HashMap<Character, Integer>() {
        {
            put('+', 1);
            put('-', 1);
            put('*', 2);
            put('/', 2);
            put('%', 2);
            put('^', 2);
            put(')', 0);
        }
    };

    public static String mediumToEnd(String medium) {
        char[] charArray = medium.toCharArray();
        StringBuilder res = new StringBuilder();
        Deque<Character> stack = new LinkedList<>();
        for (char c : charArray) {
            if (c == ' ') {
                continue;
            }
            if (c == '(') {
                stack.push(c);
                continue;
            }
            if (!map.containsKey(c)) {
                res.append(c);
                continue;
            }
            if (!stack.isEmpty() && stack.peek() == '(') {
                stack.push(c);
                continue;
            }
            if (c == ')') {
                while (stack.peek() != '(') {
                    res.append(stack.pop());
                }
                stack.pop();
                continue;
            }

            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }
            if (map.get(c) > map.get(stack.peek())) {
                stack.push(c);
                continue;
            }
            while (!stack.isEmpty() && stack.peek() != '(' && map.get(c) <= map.get(stack.peek())) {
                res.append(stack.pop());
            }
            stack.push(c);
        }
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }

        return res.toString();
    }
}
