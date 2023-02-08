package class02_;

import java.util.Arrays;

/**
 * @Author: ajie
 * @Date: 2023/2/7
 * @Description:
 * https://leetcode.cn/problems/move-zeroes/description/
 */
public class code01_移动零 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 2, 14, 8};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        //j 移动当前不为零的数字的索引
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) {
                    nums[i] = 0;
                }
                j++;
            }
        }
    }

}
