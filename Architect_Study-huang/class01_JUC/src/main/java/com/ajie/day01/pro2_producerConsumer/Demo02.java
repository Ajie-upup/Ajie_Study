package com.ajie.day01.pro2_producerConsumer;

/**
 * 在 Demo1 的基础上替换等待时的判断 if ---> while 实现两个以上的线程的交替执行，保证执行
 * 缺陷：
 * 传统的 wait 和 notify方法不能实现精准唤醒通知！
 *
 * @Author: ajie
 * @Date: 2023/1/4
 */
public class Demo02 {
    public static void main(String[] args) {
        Data2 data = new Data2();

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
        new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    data.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "C").start();

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
        new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    data.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "D").start();
    }
}

// 资源类
// 线程之间的通信： 判断  执行  通知
class Data2 {

    private int number = 0;

    // +1
    public synchronized void increment() throws InterruptedException {
        while (number != 0) { // 判断是否需要等待
            this.wait();
        }
        number++; // 执行
        System.out.println(Thread.currentThread().getName() + "\t" + number);
        // 通知
        this.notifyAll(); //唤醒所有线程
    }

    // -1
    public synchronized void decrement() throws InterruptedException {
        while (number == 0) { // 判断是否需要等待
            this.wait();
        }
        number--; // 执行
        System.out.println(Thread.currentThread().getName() + "\t" + number);
        // 通知
        this.notifyAll(); //唤醒所有线程
    }

}
