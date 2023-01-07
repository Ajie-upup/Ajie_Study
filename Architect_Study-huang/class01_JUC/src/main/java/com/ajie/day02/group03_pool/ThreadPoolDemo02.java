package com.ajie.day02.group03_pool;

import java.util.concurrent.*;

/**
 * 自定义线程池策略
 *
 * @Author: ajie
 * @Date: 2023/1/7
 */
public class ThreadPoolDemo02 {
    public static void main(String[] args) {
        /*
        public ThreadPoolExecutor(int corePoolSize, // 核心池线程数大小 (常用)
                              int maximumPoolSize,  // 最大的线程数大小 (常用)
                              long keepAliveTime, // 超时等待时间 (常用)
                              TimeUnit unit, // 时间单位 (常用)
                              BlockingQueue<Runnable> workQueue, // 阻塞队列(常用)
                              ThreadFactory threadFactory, // 线程工厂
                              RejectedExecutionHandler handler // 拒绝策略(常用))
         */

        ExecutorService threadPool = new ThreadPoolExecutor(
                2,
                5,
                3L,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy());

        /* 四大拒绝策略
         * 1、ThreadPoolExecutor.AbortPolicy()；  抛出异常，丢弃任务
         * 2、ThreadPoolExecutor.DiscardPolicy()；不抛出异常，丢弃任务
         * 3、ThreadPoolExecutor.DiscardOldestPolicy()； 尝试获取任务，不一定执行！
         * 4、ThreadPoolExecutor.CallerRunsPolicy()； 哪来的去哪里找对应的线程执行！
         */

        try {
            // 线程池的使用方式！
            for (int i = 0; i < 100; i++) {
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
