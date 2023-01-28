package class04_;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ajie
 * @Date: 2023/1/27
 * @Description: 全排列
 * https://leetcode.cn/problems/permutations/
 */
public class code03_ {
    private static List<Integer> used = new ArrayList<>();
    private static List<Integer> unused = new ArrayList<>();
    private static List<Integer> item = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        permute(arr);


    }

    public static List<List<Integer>> permute(int[] nums) {
        for (int num : nums) {
            unused.add(num);
        }
        pushNum(nums, 0);
        return null;
    }

    public static void pushNum(int[] nums, int index) {

        //依次考虑每个位置放哪个数
        item.add(nums[index]);
        pushNum(nums, index + 1);
        item.remove(item.size() - 1);
        pushNum(nums, index + 1);
    }
}
