package class03_加餐;

/**
 * @Author: ajie
 * @Date: 2023/3/1
 * @Description: https://leetcode.cn/problems/remove-duplicates-from-sorted-array/
 */
public class code01_删除有序数组中的重复项 {
    /**
     * 原地修改
     *
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        int temp = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            } else {
                nums[temp++] = nums[i];
            }
        }
        return temp;
    }

}
