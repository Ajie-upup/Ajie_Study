package class02_;

/**
 * 1248. 统计「优美子数组」：一维前缀和求解
 * https://leetcode.cn/problems/count-number-of-nice-subarrays/
 *
 * @Author: ajie
 * @Date: 2023/1/14
 */
public class code01_ {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 1, 1};
        int k = 3;
        System.out.println(numberOfSubarrays(nums, k));
    }

    public static int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int[] s = new int[n + 1];
        int[] count = new int[n + 1];
//        s[0] = 0;
        count[s[0]]++;
        for (int i = 1; i <= n; i++) {
            //nums[i - 1] % 2：将数组转换成 0 1
            s[i] = s[i - 1] + nums[i - 1] % 2;
            count[s[i]]++;
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
//            s[i] - s[j] = k 求 j 的数量
            //s[j] = s[i] - k
            if (s[i] - k >= 0) {
                ans += count[s[i] - k];
            }
        }
        return ans;
    }
}
