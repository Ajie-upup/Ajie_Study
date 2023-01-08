package class01_.group01_array;

import java.util.Arrays;

/**
 * 移动零
 * https://leetcode.cn/problems/move-zeroes/
 *
 * @Author: ajie
 * @Date: 2023/1/8
 */
public class code03_ {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            } else {
                nums[temp++] = nums[i];
            }
        }
        while (temp < nums.length) {
            nums[temp++] = 0;
        }
    }
}
