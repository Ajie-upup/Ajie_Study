package com.ajie.day02.group04_function;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Consumer：有一个输入参数，没有输出参数
 * Supplier：没有输入参数，只有输出参数
 *
 * @Author: ajie
 * @Date: 2023/1/7
 */
public class Demo03 {
    public static void main(String[] args) {

//        Supplier<String> supplier = new Supplier<String>() {
//            // 语法糖
//            @Override
//            public String get() {
//                return "《hello，spring》";
//            }
//        };

        Supplier<String> supplier = () -> {
            return "《hello，spring》";
        };
        Consumer<String> consumer = s -> {
            System.out.println(s);
        };

//        Consumer<String> consumer = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        };

        consumer.accept(supplier.get());

    }
}
