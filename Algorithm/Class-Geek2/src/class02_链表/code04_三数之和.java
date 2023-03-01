package class02_链表;

import java.util.*;

/**
 * @Author: ajie
 * @Date: 2023/2/9
 * @Description:
 */
public class code04_三数之和 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 0};
        List<List<Integer>> lists = threeSum(nums);
        System.out.println(lists);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int k = 0; k < nums.length - 2; k++) {
            if (nums[k] > 0) {
                break;
            }
            //去除重复解
            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }
            int left = k + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[k] + nums[left] + nums[right];
                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    res.add(new ArrayList<>(Arrays.asList(nums[k], nums[left], nums[right])));
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                }

            }

        }
        return res;
    }
}

