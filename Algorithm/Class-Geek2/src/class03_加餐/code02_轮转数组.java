package class03_加餐;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ajie
 * @Date: 2023/3/1
 * @Description:
 */
public class code02_轮转数组 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;

        rotate2(nums, k);
    }

    /**
     * 使用一个 map 保存数组的位置和值
     *
     * @param nums
     * @param k
     */
    public static void rotate2(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            map.put((i + k) % n, nums[i]);
        }
        for (int i = 0; i < n; i++) {
            nums[i] = map.get(i);
        }
    }

    /**
     * 数组翻转
     *
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate3(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        int temp;
        int count = 0;
        int index = 0;
        while (count < n) {
            temp = nums[index];
            index = (index + k) % n;
            nums[index] = temp;
            temp = nums[index];

        }
    }

}

