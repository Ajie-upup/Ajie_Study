package com.ajie.lamda.class03_stream;

import com.alibaba.fastjson.JSON;
import copm.ajie.part_01_lamda.class01_cart.CartService;
import copm.ajie.part_01_lamda.class01_cart.Sku;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

/**
 * 演示流式的各种终端操作
 *
 * @Author: ajie
 * @Date: 2023/1/21
 */
public class Stream_03 {
    List<Sku> list;

    @Before
    public void init() {
        list = CartService.getCartSkuList();
    }

    /**
     * allMatch：所有元素满足返回 true ,当有一个元素不满足时，直接结束(终端操作，短路操作)
     */
    @Test
    public void allMatchTest() {
        boolean match = list.stream()
                .peek(sku -> System.out.println(sku.getSkuName()))
                .allMatch(sku -> sku.getTotalPrice() > 100);
        System.out.println(match);
    }

    /**
     * anyMatch：存在一个元素满足则返回 true，也是短路操作
     */
    @Test
    public void anyMatchTest() {
        boolean match = list.stream()
                .peek(sku -> System.out.println(sku.getSkuName()))
                .anyMatch(sku -> sku.getTotalPrice() > 100);
        System.out.println(match);
    }

    /**
     * noneMatch：所有元素都不满足返回 true，也是短路操作
     */
    @Test
    public void nonMatchTest() {
        boolean match = list.stream()
                .peek(sku -> System.out.println(sku.getSkuName()))
                .noneMatch(sku -> sku.getTotalPrice() > 10_000);
        System.out.println(match);
    }

    /**
     * findFirst：找到第一个元素，可能为空
     */
    @Test
    public void findFirstTest() {
        Optional<Sku> option = list.stream()
                .findFirst();
        System.out.println(JSON.toJSONString(option.get(), true));
    }

    /**
     * findAny：找到任意一个元素，在串行条件下和 findFirst 效果相同
     * 在并行条件下，返回的结果为任意一个，不能保证元素的可靠性
     */
    @Test
    public void findAnyTest() {
        Optional<Sku> option = list.stream()
                .findAny();
        System.out.println(JSON.toJSONString(option.get(), true));
    }

    /**
     * max：找出筛选元素中的最大值
     */
    @Test
    public void maxTest() {
        OptionalDouble max = list.stream()
                .mapToDouble(Sku::getTotalPrice)
                .max();
        System.out.println(max);
    }

    /**
     * min：找出筛选元素中的最小值
     */
    @Test
    public void minTest() {
        OptionalDouble min = list.stream()
                .mapToDouble(Sku::getTotalPrice)
                .min();
        System.out.println(min);
    }

    /**
     * count：返回元素中的个数
     */
    @Test
    public void countTest() {
        long count = list.stream()
                .count();
        System.out.println(count);
    }

}
