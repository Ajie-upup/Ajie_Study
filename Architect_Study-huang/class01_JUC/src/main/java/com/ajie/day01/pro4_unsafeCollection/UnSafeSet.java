package com.ajie.day01.pro4_unsafeCollection;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * @Author: ajie
 * @Date: 2023/1/6
 */
public class UnSafeSet {
    public static void main(String[] args) {
        // HashSet 底层是什么 就是 HashMap
        // add，就是 HashMap 的 key；

        //ConcurrentModificationException 并发修改异常
        Set<String> set = new HashSet<>();
        //解决方案：
//        Set<String> set = Collections.synchronizedSet(new HashSet<>());
//        Set<String> set = new CopyOnWriteArraySet();

        for (int i = 1; i <=30 ; i++) {
            new Thread(()->{
                set.add(UUID.randomUUID().toString().substring(0,3));
                System.out.println(set);
            },String.valueOf(i)).start();
        }
    }
}
