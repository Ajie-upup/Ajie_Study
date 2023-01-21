package com.ajie.lamda.class03_stream;

import com.alibaba.fastjson.JSON;
import copm.ajie.part_01_lamda.class01_cart.CartService;
import copm.ajie.part_01_lamda.class01_cart.Sku;
import copm.ajie.part_01_lamda.class01_cart.SkuCategoryEnum;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 演示流式的各种中间操作
 *
 * @Author: ajie
 * @Date: 2023/1/21
 */
public class Stream_02 {
    List<Sku> list;

    @Before
    public void init() {
        list = CartService.getCartSkuList();
    }

    /**
     * filter：过滤掉不符合断言判断的数据
     */
    @Test
    public void filterTest() {
        list.stream()
                .filter(sku -> SkuCategoryEnum.BOOKS.equals(sku.getSkuCategory()))
                .forEach(sku -> System.out.println(JSON.toJSONString(sku, true)));
    }

    /**
     * map：元素类型转换，也可以用作筛选
     */
    @Test
    public void mapTest() {
        list.stream()
                .map(sku -> sku.getSkuName())
                .forEach(System.out::println);
    }

    /**
     * flatMap：将一个对象转换成一个流，进行操作
     */
    @Test
    public void flatMapTest() {
        list.stream()
                .flatMap(sku ->
                        Arrays.stream(sku.getSkuName().split("")))
                .forEach(System.out::println);
    }

    /**
     * peek：元素遍历的中间操作，执行完毕之后仍然是一个流
     * forEach执行完之后，就不再是一个流
     * 此处，peek和forEach操作交替执行
     */
    @Test
    public void peekTest() {
        list.stream()
                .peek(sku -> System.out.println(sku.getSkuName()))
                .forEach(sku -> System.out.println(JSON.toJSONString(sku, true)));
    }

    /**
     * sort：排序操作，默认数字类型按照升序排列
     * 此处，peek先执行完后执行forEach
     */
    @Test
    public void sortTest() {
        list.stream()
                .peek(sku -> System.out.println(sku.getSkuName()))
                .sorted(Comparator.comparing(Sku::getTotalPrice))
                .forEach(sku -> System.out.println(JSON.toJSONString(sku, true)));
    }

    /**
     * distinct：元素去重
     */
    @Test
    public void distinctTest() {
        list.stream()
                .map(sku -> sku.getSkuCategory())
                .distinct()
                .forEach(System.out::println);
    }

    /**
     * skip：跳过前几条元素
     */
    @Test
    public void skipTest() {
        list.stream()
                .sorted(Comparator.comparing(Sku::getTotalPrice))
                .skip(3)
                .forEach(sku -> System.out.println(JSON.toJSONString(sku, true)));
    }

    /**
     * limit：限制元素 size
     */
    @Test
    public void limitTest() {
        list.stream()
                .sorted(Comparator.comparing(Sku::getTotalPrice))
                .limit(3)
                .forEach(sku -> System.out.println(JSON.toJSONString(sku, true)));
    }


}
