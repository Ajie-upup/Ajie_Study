package com.ajie.day01.pro3_lock8;

import java.util.concurrent.TimeUnit;

/**
 * @Author: ajie
 * @Date: 2023/1/6
 */
public class LockDemo08 {
    public static void main(String[] args) throws InterruptedException {
        /*
        8、一个普通同步方法，一个静态同步方法，两个手机，请问先执行sendEmail 还是 sendSMS
            答案：sendSMS
            synchronized 锁的是这个调用的对象
            static 锁的是这个类的Class模板
            这里是两个锁！
         */
        Phone8 phone = new Phone8();
        Phone8 phone2 = new Phone8();

        new Thread(()->{
            try {
                phone.sendEmail();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"A").start();

        //Thread.sleep(200);
        TimeUnit.SECONDS.sleep(1);

        new Thread(()->{
            phone2.sendSMS();
        },"B").start();
    }
}

class Phone8{

    public static synchronized void sendEmail() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        System.out.println("sendEmail");
    }

    public synchronized void sendSMS(){
        System.out.println("sendSMS");
    }

}
