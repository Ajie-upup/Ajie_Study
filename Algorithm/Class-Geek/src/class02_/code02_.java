package class02_;

/**
 * 304. 二维区域和检索 - 矩阵不可变：二维前缀和模板
 * https://leetcode.cn/problems/range-sum-query-2d-immutable/
 *
 * @Author: ajie
 * @Date: 2023/1/14
 */

public class code02_ {
    static int[][] sum;

    public static void main(String[] args) {
        int[][] nums = {{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}};

        sumMatrix(nums);
        int res1 = sumRegion(2, 1, 4, 3);
        int res2 = sumRegion(1, 1, 2, 2);
        int res3 = sumRegion(1, 2, 2, 4);

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);

//        int[][] nums = {{-1}};
//        sumMatrix(nums);
//        int res = sumRegion(0, 0, 0, 0);
//        System.out.println(res);
    }

    public static int[][] sumMatrix(int[][] matrix) {
        int lenI = matrix.length;
        int lenJ = lenI == 0 ? 0 : matrix[0].length;

        sum = new int[lenI + 1][lenJ + 1];
        for (int i = 0; i < lenI; i++) {
            for (int j = 0; j < lenJ; j++) {
                sum[i + 1][j + 1] = sum[i + 1][j] + sum[i][j + 1] - sum[i][j] + matrix[i][j];
            }
        }
        return sum;
    }

    public static int sumRegion(int row1, int col1, int row2, int col2) {

        return sum[row2 + 1][col2 + 1] - sum[row2 + 1][col1] - sum[row1][col2 + 1] + sum[row1][col1];
    }
}
