package com.ajie.day02.group05_stream;

import java.util.Arrays;
import java.util.List;

/**
 * 数据库、集合 ： 存数据的
 * Stream：计算和处理数据交给 Stream
 *
 * @Author: ajie
 * @Date: 2023/1/7
 */
public class StreamDemo {
    /**
     * 按条件用户筛选：
     * 1、id 为偶数
     * 2、年龄大于24
     * 3、用户名大写   映射
     * 4、用户名倒排序
     * 5、输出一个用户
     * <p>
     * 请你只用一行代码完成！
     */
    public static void main(String[] args) {
        User u1 = new User(1, "a", 23);
        User u2 = new User(2, "b", 24);
        User u3 = new User(3, "c", 22);
        User u4 = new User(4, "d", 28);
        User u5 = new User(6, "e", 26);

        // 存储
        List<User> users = Arrays.asList(u1, u2, u3, u4, u5);
        // 计算等操作交给流
        // forEach(消费者类型接口)
        users.stream()
                .filter(u -> {
                    return u.getId() % 2 == 0;
                })
                .filter(u -> {
                    return u.getAge() > 24;
                })
                .map(u -> {
                    return u.getName().toUpperCase();
                })
                .sorted((o1, o2) -> {
                    return o2.compareTo(o1);
                })
                .limit(1)
                .forEach(System.out::println);

        // 在JDK1.5 的时候，枚举：反射、注解、泛型
        // 在JDK1.8 的时候  函数式接口、Stream流式计算、lambda表达式、链式编程！
        // 无论何时，都还需要掌握一个东西叫 JVM；
        // JVM: 你会了这个技术不会觉得你恨厉害！
    }

}