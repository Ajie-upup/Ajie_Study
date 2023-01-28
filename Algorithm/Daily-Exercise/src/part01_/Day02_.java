package part01_;

/**
 * @Author: ajie
 * @Date: 2023/1/28
 * @Description: 生成平衡数组的方案数
 * https://leetcode.cn/problems/ways-to-make-a-fair-array/
 */
public class Day02_ {
    public static void main(String[] args) {
//        int[] nums = {2, 1, 6, 4};
        int[] nums = {1, 2, 3};
        int res = waysToMakeFair(nums);
        System.out.println(res);
    }

    private static int count = 0;
    //奇数和
    private static int oddRight = 0;
    private static int oddLeft = 0;
    //偶数和
    private static int evenRight = 0;
    private static int evenLeft = 0;


    public static int waysToMakeFair(int[] nums) {
        for (int i = 0; i < nums.length; ++i) {
            if ((i & 1) != 0) {
                oddRight += nums[i];
            } else {
                evenRight += nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            rightChange(nums, i);
            if (oddLeft + evenRight == oddRight + evenLeft) {
                ++count;
            }
            leftChange(nums, i);
        }
        return count;
    }

    public static void rightChange(int[] nums, int index) {
        if ((index & 1) != 0) {
            oddRight -= nums[index];
        } else {
            evenRight -= nums[index];
        }
    }

    public static void leftChange(int[] nums, int index) {
        if ((index & 1) != 0) {
            oddLeft += nums[index];
        } else {
            evenLeft += nums[index];
        }
    }

}
