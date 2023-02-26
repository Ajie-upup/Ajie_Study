package class04_Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @Author: ajie
 * @Date: 2023/2/22
 * @Description: https://leetcode.cn/problems/valid-parentheses/
 */
public class _有效括号 {
    /**
     * 方法一：使用字符串的替换方法（时间空间消耗大）
     *
     * @param s
     * @return
     */
    public boolean isValid1(String s) {
        while (s.contains("{}") || s.contains("()") || s.contains("[]")) {
            s.replace("{}", "");
            s.replace("()", "");
            s.replace("[]", "");
        }
        return s.isEmpty();
    }

    /**
     * 方法二：使用栈进行左右括号的匹配
     *
     * @param s
     * @return
     */
    public boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char left = stack.pop();
                if (left == '(' && c != ')') {
                    return false;
                }
                if (left == '{' && c != '}') {
                    return false;
                }
                if (left == '[' && c != ']') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static Map<Character, Character> map = new HashMap<>();

    static {
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
    }


    /**
     * 方法三：使用 map 提前存储括号，加快查询速度
     *
     * @param s
     * @return
     */
    public boolean isValid3(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (c != map.get(stack.pop())) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
