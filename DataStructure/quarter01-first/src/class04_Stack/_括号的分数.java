package class04_Stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author: ajie
 * @Date: 2023/2/22
 * @Description: https://leetcode.cn/problems/score-of-parentheses/
 */
public class _括号的分数 {
    public int scoreOfParentheses(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(0);
            } else {
                int cur = stack.pop();
                stack.push(stack.pop() + Math.max(cur * 2, 1));
            }
        }
        return stack.pop();
    }
}
