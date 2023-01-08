package class01_.group01_array;

/**
 * 删除有序数组中的重复项
 * https://leetcode.cn/problems/remove-duplicates-from-sorted-array/
 *
 * @Author: ajie
 * @Date: 2023/1/8
 */
public class code02_ {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int count = removeDuplicates(nums);
        System.out.println(count);
    }

    public static int removeDuplicates(int[] nums) {
        /*
            定义一个临时变量标记前 n 个不重复的元素
         */
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
