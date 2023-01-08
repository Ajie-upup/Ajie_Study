package com.ajie.class01_Complexity;

/**
 * 测试斐波那契数列
 *
 * @Author: ajie
 * @Date: 2023/1/8
 */
public class Main {
    /**
     * @param n
     * @return 第 n 个斐波那契数列的值
     */
    public static int fib1(int n) {
        if (n <= 1) {
            return n;
        }
        return fib1(n - 1) + fib1(n - 2);
    }

    public static int fib2(int n) {
        if (n <= 1) {
            return n;
        }

        int first = 0;
        int second = 1;

        for (int i = 0; i < n - 1; i++) {
            int sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }

    /*
     * 0 1 1 2 3 5 8
     */
    public static void main(String[] args) {
        int n = 30;
        System.out.println(fib1(n));
    }
}
