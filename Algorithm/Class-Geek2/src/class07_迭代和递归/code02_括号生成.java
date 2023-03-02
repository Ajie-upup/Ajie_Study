package class07_迭代和递归;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ajie
 * @Date: 2023/3/2
 * @Description: https://leetcode.cn/problems/generate-parentheses/
 */
public class code02_括号生成 {
    private List<String> ans;

    public List<String> generateParenthesis(int n) {
        ans = new ArrayList<>();
        generateAll(0, 0, n, "");
        return ans;
    }

    private void generateAll(int left, int right, int n, String s) {
        if (left == n && right == n) {
            //结束循环的条件
            ans.add(s);
            return;
        }
        if (left < n) {
            generateAll(left + 1, right, n, s + "(");
        }
        if (left > right) {
            //添加右括号的情况 right < n && right < left
            generateAll(left, right + 1, n, s + ")");
        }
    }
}
