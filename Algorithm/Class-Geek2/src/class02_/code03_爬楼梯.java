package class02_;

/**
 * @Author: ajie
 * @Date: 2023/2/9
 * @Description: https://leetcode.cn/problems/climbing-stairs/
 */
public class code03_爬楼梯 {
    public static void main(String[] args) {
        int res = climbStairs(4);
        System.out.println(res);
    }

    /**
     * 变相的斐波拉契数列
     * f(n) = f(n-1) + f(n-2)
     *
     * @param n
     * @return
     */
    public static int climbStairs(int n) {
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }

}
