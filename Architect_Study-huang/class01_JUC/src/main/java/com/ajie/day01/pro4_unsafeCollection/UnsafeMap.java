package com.ajie.day01.pro4_unsafeCollection;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: ajie
 * @Date: 2023/1/6
 */
public class UnsafeMap {
    public static void main(String[] args) {
        // new HashMap<>() 工作中是这样用的吗？ 不是
        // 加载因子0.75f;，容量 16； 这两个值工作中不一定这样用！
        // 优化性能！
        // HashMap 底层数据结构，链表 + 红黑树
//        Map<String, String> map = new HashMap<>();
        Map<String, String> map = new ConcurrentHashMap<>();

        // 人生如程序，不是选择就是循环，时常的自我总结十分重要！
        for (int i = 1; i <= 30; i++) {
            new Thread(() -> {
                map.put(Thread.currentThread().getName(), UUID.randomUUID().toString().substring(0, 3));
                System.out.println(map);
            }, String.valueOf(i)).start();
        }

    }
}
