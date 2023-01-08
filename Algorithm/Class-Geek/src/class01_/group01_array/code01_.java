package class01_.group01_array;

import java.util.Arrays;

/**
 * 合并两个有序数组
 * https://leetcode.cn/problems/merge-sorted-array/description/
 *
 * @Author: ajie
 * @Date: 2023/1/7
 */
public class code01_ {
    public static void main(String[] args) {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        /*
            定义两个指针变量 i、j 分别从末尾遍历数组一和数组二
            将两个数组中较大的数填充在数组一的末尾
         */
        int i = m - 1, j = n - 1;
        for (int k = m + n - 1; k >= 0; k--) {
            if (j < 0 || (i >= 0 && nums1[i] > nums2[j])) {
                nums1[k] = nums1[i--];
            } else {
                nums1[k] = nums2[j--];
            }
        }
    }
}
