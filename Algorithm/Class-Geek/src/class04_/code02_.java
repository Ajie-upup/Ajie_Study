package class04_;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ajie
 * @Date: 2023/1/26
 * @Description: 组合
 * https://leetcode.cn/problems/combinations/
 */
public class code02_ {

    private static List<List<Integer>> res = new ArrayList<>();

    private static List<Integer> items = new ArrayList<>();

    public static void main(String[] args) {
        int n = 4, k = 2;
        List<List<Integer>> combine = combine(n, k);
        System.out.println(combine.toString());
    }

    public static List<List<Integer>> combine(int n, int k) {
        selectNum(n, 1, k);
        return res;
    }

    public static void selectNum(int n, int cur, int k) {
        //剪枝：当前 items 的长度 + 剩下全部元素的个数不满足 k 的条件就直接返回
        if (items.size() + (n - cur + 1) < k) {
            return;
        }
        if (items.size() == k) {
            res.add(new ArrayList<>(items));
            return;
        }
        items.add(cur);
        selectNum(n, cur + 1, k);
        items.remove(items.size() - 1);
        selectNum(n, cur + 1, k);
    }

}
