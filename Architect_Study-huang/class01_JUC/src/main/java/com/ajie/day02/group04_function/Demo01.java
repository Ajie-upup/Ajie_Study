package com.ajie.day02.group04_function;

import java.util.function.Function;

/**
 * Function ： 有一个输入参数有一个输出参数

 *
 * @Author: ajie
 * @Date: 2023/1/7
 */
public class Demo01 {
    public static void main(String[] args) {
        //
//        Function<String,Integer> function = new Function<String,Integer>() {
//            @Override
//            public Integer apply(String str) {
//                return str.length();
//            }
//        };

        // (参数)->{方法体}
        Function<String, Integer> function = (str) -> {
            return str.length();
        };
        System.out.println(function.apply("a45645646"));
    }
}

