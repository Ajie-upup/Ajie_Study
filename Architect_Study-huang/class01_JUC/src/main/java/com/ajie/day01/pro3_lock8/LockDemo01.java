package com.ajie.day01.pro3_lock8;

import java.util.concurrent.TimeUnit;

/**
 * 被 synchronized 修饰的方式，锁的对象是方法的调用者，所以说这里两个方法调用的对象是同一个
 * 先调用的先执行！
 *
 * @Author: ajie
 * @Date: 2023/1/6
 */

public class LockDemo01 {
    public static void main(String[] args) throws InterruptedException {
        /*
        1、标准的访问情况下，先执行 sendEmail 还是 sendSMS

           答案：sendEmail
           被 synchronized 修饰的方式，锁的对象是方法的调用者，所以说这里两个方法调用的对象是同一个
           先调用的先执行！
        */
        Phone phone = new Phone();

        new Thread(() -> {
            phone.sendEmail();
        }, "A").start();

        //Thread.sleep(200);
        TimeUnit.SECONDS.sleep(2);

        new Thread(phone::sendSMS, "B").start();
    }
}

class Phone {
    public synchronized void sendEmail() {
        System.out.println("sendEmail");
    }

    public synchronized void sendSMS() {
        System.out.println("sendSMS");
    }
}
