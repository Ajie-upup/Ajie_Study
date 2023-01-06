package com.ajie.day01.pro2_producerConsumer;

/**
 * synchronized 实现线程之间的通信
 * 目的： 有两个线程：A  B ，还有一个值初始为0，实现两个线程交替执行，对该变量 + 1，-1；交替10次
 * 缺陷：当有四个线程时，使用 if 存在 线程间通信异常的问题
 *
 * @Author: ajie
 * @Date: 2023/1/4
 */
public class Demo01 {
    public static void main(String[] args) {
        Data data = new Data();
        // +1
        new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    data.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "A").start();

//        new Thread(() -> {
//            for (int i = 1; i <= 10; i++) {
//                try {
//                    data.increment();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }, "C").start();

        // -1
        new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    data.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "B").start();

//        new Thread(() -> {
//            for (int i = 1; i <= 10; i++) {
//                try {
//                    data.decrement();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }, "D").start();
    }
}

// 资源类
// 线程之间的通信： 判断  执行  通知
class Data {

    private int number = 0;

    // +1
    public synchronized void increment() throws InterruptedException {
        if (number != 0) { // 判断是否需要等待
            this.wait();
        }
        number++; // 执行
        System.out.println(Thread.currentThread().getName() + "\t" + number);
        // 通知
        this.notifyAll(); //唤醒所有线程
    }

    // -1
    public synchronized void decrement() throws InterruptedException {
        if (number == 0) { // 判断是否需要等待
            this.wait();
        }
        number--; // 执行
        System.out.println(Thread.currentThread().getName() + "\t" + number);
        // 通知
        this.notifyAll(); //唤醒所有线程
    }
}
