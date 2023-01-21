package com.ajie.lamda.class03_stream;

import com.alibaba.fastjson.JSON;
import copm.ajie.part_01_lamda.class01_cart.CartService;
import copm.ajie.part_01_lamda.class01_cart.Sku;
import copm.ajie.part_01_lamda.class01_cart.SkuCategoryEnum;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

/**
 * @Author: ajie
 * @Date: 2023/1/18
 */
public class Stream_01 {
    List<Sku> cartSkuList = CartService.getCartSkuList();

    @Test
    public void testNoStream() {
        //1.查询全部购物车商品
//        System.out.println(JSON.toJSONString(cartSkuList, true));

        //2.过滤其中商品类别为图书的商品
        List<Sku> nonBookList = new ArrayList<>();
        for (Sku sku : cartSkuList) {
            if (!SkuCategoryEnum.BOOKS.equals(sku.getSkuCategory())) {
                nonBookList.add(sku);
            }
        }
//        System.out.println(JSON.toJSONString(nonBookList, true));

        //3.根据价格进行降序排序
        nonBookList.sort((sku1, sku2) -> (int) (sku2.getTotalPrice() - sku1.getTotalPrice()));
//        System.out.println(JSON.toJSONString(nonBookList, true));

        //4.降序排序收集其中价格最高的两件商品并记录器名称和总价
        Double totalMoney = 0.00;
        List<String> buyList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            buyList.add(nonBookList.get(i).getSkuName());
            totalMoney += nonBookList.get(i).getTotalPrice();
        }
        System.out.println(buyList);
        System.out.println("总价为：" + totalMoney);
    }

    @Test
    public void testStream() {
        //保证多线程安全
        AtomicReference<Double> money = new AtomicReference<>(Double.valueOf(0.0));

        List<String> result = cartSkuList.stream()
                /**
                 * 1.打印商品信息
                 */
                .peek(sku -> System.out.println(JSON.toJSONString(sku, true)))
                /**
                 * 2.过滤分类为图书的商品
                 */
                .filter(sku -> !SkuCategoryEnum.BOOKS.equals(sku.getSkuCategory()))
                /**
                 * 3.按照总金额降序排序
                 */
                .sorted(Comparator.comparing(Sku::getTotalPrice).reversed())
                /**
                 * 4.过滤其中价格最大的两件商品
                 */
                .limit(2)
                /**
                 * 5.对金额进行累加
                 */
                .peek(sku -> money.set(money.get() + sku.getTotalPrice()))
                /**
                 * 6.获取商品名称
                 */
                .map(Sku::getSkuName)
                .collect(Collectors.toList());
        System.out.println(result);
        System.out.println("总价为：" + money);

    }
}
