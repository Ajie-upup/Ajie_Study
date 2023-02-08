package class02_;

/**
 * @Author: ajie
 * @Date: 2023/2/9
 * @Description: 盛水最多的容器
 * https://leetcode.cn/problems/container-with-most-water/
 */
public class code02_盛水最多的容器 {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int area1 = maxArea1(height);
        System.out.println(area1);
        int area2 = maxArea2(height);
        System.out.println(area2);
    }

    /**
     * 方法一：暴力，枚举出所有可能盛水的情况进行比较
     *
     * @param height
     * @return
     */
    public static int maxArea1(int[] height) {
        int area = 0;
        int temp;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                temp = (j - i) * Math.min(height[i], height[j]);
                area = Math.max(area, temp);
            }
        }
        return area;
    }

    /**
     * 方法二：使用双指针遍历 height 数组，每次移动高度较小的 index
     *
     * @param height
     * @return
     */
    public static int maxArea2(int[] height) {
        int maxArea = 0;
        int minHeight;
        int area;
        for (int i = 0, j = height.length - 1; i < j; ) {
            minHeight = height[i] < height[j] ? height[i++] : height[j--];
            //上一步已经做了 i j 指针的变化，减小了单位 1 ，所以需要补回来
            area = (j - i + 1) * minHeight;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }


}
