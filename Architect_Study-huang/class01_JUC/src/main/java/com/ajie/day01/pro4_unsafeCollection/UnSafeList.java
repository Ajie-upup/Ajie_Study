package com.ajie.day01.pro4_unsafeCollection;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Author: ajie
 * @Date: 2023/1/6
 */
public class UnSafeList {
    /**
     * 故障现象：ConcurrentModificationException 并发修改异常
     * 导致原因：add方法没有锁！
     * 解决方案：
     * 1、List<String> list = new Vector<>(); //jdk1.0 就存在的！效率低
     * 2、List<String> list = Collections.synchronizedList(new ArrayList<>());
     * 3、List<String> list = new CopyOnWriteArrayList<>();
     * <p>
     * 什么是 CopyOnWrite； 写入是复制 （思想 COW）
     * 多个调用者同时要相同的资源；这个有一个指针的概念。
     * 读写分离的思想：
     */
    public static void main(String[] args) {
//        List<String> list = Arrays.asList("a", "b", "c");
//        list.forEach(System.out::println);

        //存在 ConcurrentModificationException 并发修改异常
//        List<String> unsafeList = new ArrayList<>();

        List<String> list = new CopyOnWriteArrayList<>();

        for (int i = 1; i <= 30; i++) {
            //String.valueOf(i) 线程名称
            new Thread(() -> {
                list.add(UUID.randomUUID().toString().substring(0, 3));
                System.out.println(list);
            }, String.valueOf(i)).start();
        }
    }
}
