package com.ajie.day02.group03_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 三大方法(一般不适用三大方法直接创建线程池)
 *
 * @Author: ajie
 * @Date: 2023/1/7
 */
public class ThreadPoolDemo01 {
    public static void main(String[] args) {
        // 单例，只能有一个线程！
        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        // 固定的线程数
//         ExecutorService threadPool = Executors.newFixedThreadPool(8);
        // 遇强则强！可伸缩！
//         ExecutorService threadPool = Executors.newCachedThreadPool();

        try {
            // 线程池的使用方式！
            for (int i = 0; i < 30; i++) {
                threadPool.execute(() -> {
                    System.out.println(Thread.currentThread().getName() + " ok");
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 使用完毕后需要关闭！
            threadPool.shutdown();
        }

    }
}
