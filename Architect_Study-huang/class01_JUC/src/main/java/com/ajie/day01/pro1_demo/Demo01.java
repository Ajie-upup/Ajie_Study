package com.ajie.day01.pro1_demo;

/**
 * synchronized 同步锁实现线程安全
 *
 * @Author: ajie
 * @Date: 2022/12/30
 */
public class Demo01 {
    public static void main(String[] args) {
        //1、新建资源类
        Ticket ticket = new Ticket();

        //2、线程操纵资源类
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 30; i++) {
                    ticket.saleTicket();
                }
            }
        }, "A").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 30; i++) {
                    ticket.saleTicket();
                }
            }
        }, "B").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 30; i++) {
                    ticket.saleTicket();
                }
            }
        }, "C").start();

    }
}

class Ticket {
    private int number = 30;

    //synchronized 同步锁
    public synchronized void saleTicket() {
        if (number > 0) {
            System.out.println(
                    Thread.currentThread().getName() + "卖出第" + (number--) + "票，还剩：" + number + "张"
            );
        }
    }
}
