package class04_;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ajie
 * @Date: 2023/1/26
 * @Description: 子集：https://leetcode.cn/problems/subsets/
 */
public class code01_ {

    private static List<List<Integer>> res = new ArrayList<>();

    private static List<Integer> items = new ArrayList<>();

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = subsets(nums);
        System.out.println(subsets.toString());
    }

    public static List<List<Integer>> subsets(int[] nums) {
        addNum(nums, 0);
        return res;
    }

    public static void addNum(int[] nums, int cur) {
        if (cur == nums.length) {
            res.add(new ArrayList<>(items));
            return;
        }
        //选择 cur 下标的数
        items.add(nums[cur]);
        addNum(nums, cur + 1);
        //移除 cur 下标的数 ===  不选择当前下标的数
        items.remove(items.size() - 1);
        addNum(nums, cur + 1);
    }

}
