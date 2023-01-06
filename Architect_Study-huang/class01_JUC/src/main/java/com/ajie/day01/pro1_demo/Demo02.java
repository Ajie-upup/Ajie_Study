package com.ajie.day01.pro1_demo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: ajie
 * @Date: 2022/12/30
 */
public class Demo02 {
    public static void main(String[] args) {
        //1、新建资源类
        Ticket2 ticket = new Ticket2();
        //2、线程操作资源类
        new Thread(() -> {for (int i = 1; i <= 30; i++) ticket.saleTicket();}, "A").start();
        new Thread(() -> {for (int i = 1; i <= 30; i++) ticket.saleTicket();}, "B").start();
        new Thread(() -> {for (int i = 1; i <= 30; i++) ticket.saleTicket();}, "C").start();
    }
}

class Ticket2 {

    //使用Lock，它是一个对象
    //ReentrantLock 可重入锁
    // ReentrantLock 默认是非公平锁！
    // 非公平锁: 不公平 （插队，后面的线程可以插队）
    // 公平锁: 公平（只能排队，后面的线程无法插队）
    private Lock lock = new ReentrantLock();

    private int number = 30;

    public void saleTicket() {
        //加锁
        lock.lock();
        try {
            //业务代码
            if (number > 0) {
                System.out.println(
                        Thread.currentThread().getName() + "卖出第" + (number--) + "票，还剩：" + number + "张"
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //解锁
            lock.unlock();
        }
    }
}
