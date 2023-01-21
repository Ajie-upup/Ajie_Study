package com.ajie.lamda.cart;

import com.alibaba.fastjson.JSON;
import copm.ajie.part_01_lamda.class01_cart.CartService;
import copm.ajie.part_01_lamda.class01_cart.Sku;
import copm.ajie.part_01_lamda.class01_cart.SkuCategoryEnum;
import org.junit.Test;

import java.util.List;

/**
 * @Author: ajie
 * @Date: 2023/1/17
 */

public class CartServiceTest {

    @Test
    public void filterElectronicsSkus() {
        List<Sku> cartSkuList = CartService.getCartSkuList();

        // 查找购物车中数码类商品
        List<Sku> result =
                CartService.filterElectronicsSkus(cartSkuList);

        System.out.println(
                JSON.toJSONString(result, true));
    }

    @Test
    public void filterSkusByCategory() {
        List<Sku> cartSkuList = CartService.getCartSkuList();

        // 查找购物车中图书类商品集合
        List<Sku> result = CartService.filterSkuByCategory(
                cartSkuList, SkuCategoryEnum.BOOKS);

        System.out.println(JSON.toJSONString(
                result, true));
    }

    @Test
    public void filterSkuByCategoryOrPrice() {
        List<Sku> cartSkuList = CartService.getCartSkuList();

        // 根据商品总价过滤超过2000元的商品列表
        List<Sku> result = CartService.filterSkuByCategoryOrPrice(
                cartSkuList, null,
                2000.00, false);

        System.out.println(JSON.toJSONString(
                result, true));
    }

    @Test
    public void filterSkuTest() {
        List<Sku> cartSkuList = CartService.getCartSkuList();

        // 根据商品总价过滤超过2000元的商品列表 ----- 匿名内部类
//        List<Sku> result = CartService.filterSku(cartSkuList, new SkuPredicate() {
//            @Override
//            public boolean skeHandler(Sku sku) {
//                return sku.getTotalPrice() > 2000;
//            }
//        });

        // lambda 表达式
        List<Sku> result = CartService.filterSku(cartSkuList,
                (Sku sku) -> sku.getTotalPrice() > 2000);
        System.out.println(JSON.toJSONString(result, true));
    }
}
