package com.ajie.day01.pro2_producerConsumer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * java.util.concurrent.locks.Lock锁 实现线程交替执行！
 * 主要的实现目标：精准的唤醒线程！
 * 三个线程：A B C
 * 三个方法：A p5  B p10   C p15 依次循环
 *
 * @Author: ajie
 * @Date: 2023/1/6
 */
public class Demo03 {
    public static void main(String[] args) {
        Data3 data = new Data3();

        new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    data.print5();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "A").start();

        new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    data.print10();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "B").start();

        new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    data.print15();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "C").start();
    }
}

// 资源类
class Data3 {
    private int number = 1; // 1A 2B  3C
    private Lock lock = new ReentrantLock();
    // 实现精准访问
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();
    private Condition condition3 = lock.newCondition();

    public void print5() throws InterruptedException {

        lock.lock();

        try {
            // 判断
            while (number != 1) {
                condition1.await();
            }
            // 执行
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
            // 通知第二个线程干活！
            number = 2;
            condition2.signal(); // 唤醒
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock(); // 一定要解锁
        }
    }

    public void print10() throws InterruptedException {
        lock.lock();
        try {
            // 判断
            while (number != 2) {
                condition2.await();
            }
            // 执行
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
            // 通知3干活
            number = 3;
            condition3.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void print15() throws InterruptedException {
        lock.lock();
        try {
            // 判断
            while (number != 3) {
                condition3.await();
            }
            // 执行
            for (int i = 1; i <= 15; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
            // 通知 1 干活
            number = 1;
            condition1.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
