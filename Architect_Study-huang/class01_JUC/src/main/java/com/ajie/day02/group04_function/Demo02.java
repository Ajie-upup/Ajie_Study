package com.ajie.day02.group04_function;

import java.util.function.Predicate;

/**
 * Predicate：有一个输入参数，判断是否正确！
 *
 * @Author: ajie
 * @Date: 2023/1/7
 */
public class Demo02 {
    public static void main(String[] args) {

//        Predicate<String> predicate = new Predicate<String>() {
//            @Override
//            public boolean test(String str) {
//                return str.isEmpty();
//            }
//        };

        Predicate<String> predicate = str -> {
            return str.isEmpty();
        };

        System.out.println(predicate.test("456"));


    }
}
