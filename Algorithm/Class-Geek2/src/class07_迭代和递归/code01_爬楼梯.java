package class07_迭代和递归;

/**
 * @Author: ajie
 * @Date: 2023/3/1
 * @Description: https://leetcode-cn.com/problems/climbing-stairs/
 */
public class code01_爬楼梯 {
    /**
     * 使用一个数组模拟递归，但是保存之前递归的结果，优化了递归的层数
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        int[] stair = new int[n + 1];
        stair[0] = 1;
        stair[1] = 1;
        for (int i = 2; i <= n; i++) {
            stair[i] = stair[i - 1] + stair[i - 2];
        }
        return stair[n];
    }
}
