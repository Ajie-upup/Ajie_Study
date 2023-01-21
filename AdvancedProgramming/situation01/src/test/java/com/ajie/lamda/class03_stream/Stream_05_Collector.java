package com.ajie.lamda.class03_stream;

import com.alibaba.fastjson.JSON;
import copm.ajie.part_01_lamda.class01_cart.CartService;
import copm.ajie.part_01_lamda.class01_cart.Sku;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 常见的预定义收集器的使用
 *
 * @Author: ajie
 * @Date: 2023/1/21
 */
public class Stream_05_Collector {

    List<Sku> list;

    @Before
    public void init() {
        list = CartService.getCartSkuList();
    }

    /**
     * toList：将元素转换成集合
     */
    @Test
    public void toListTest() {
        List<Sku> collect = list.stream()
                .filter(sku -> sku.getTotalPrice() > 100)
                .collect(Collectors.toList());
        System.out.println(JSON.toJSONString(collect, true));
    }

    /**
     * groupingBy：根据条件将元素进行分组
     */
    @Test
    public void groupTest() {
        //Map<元素条件, 分组元素>
        Map<Object, List<Sku>> collect = list.stream()
                .collect(Collectors.groupingBy(Sku::getSkuCategory));
        System.out.println(JSON.toJSONString(collect, true));
    }

    /**
     * partition：将元素进行分区，分为符合条件的和不符合条件的
     */
    @Test
    public void partitionTest() {
        Map<Boolean, List<Sku>> collect = list.stream()
                .collect(Collectors.partitioningBy(sku -> sku.getTotalPrice() > 100));
        System.out.println(JSON.toJSONString(collect, true));
    }

}
