package com.ajie.lamda.class02_file;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 四大方法引用测试
 *
 * @Author: ajie
 * @Date: 2023/1/17
 */
public class MethodReferenceTest {
    static class Sku {
        private String skuName;
        private Integer skuPrice;

        public Integer getSkuPrice() {
            return skuPrice;
        }

        //1.
        public static int staticComparePrice(Sku sku1, Sku sku2) {
            return sku1.getSkuPrice() - sku2.getSkuPrice();
        }

        //3.
        public int instanceComparePrice(Sku sku) {
            return this.getSkuPrice() - sku.getSkuPrice();
        }
    }

    //2.
    class PriceCompare {
        public int instanceComparePrice(Sku sku1, Sku sku2) {
            return sku1.getSkuPrice() - sku2.getSkuPrice();
        }
    }

    public void test() {

        List<Sku> skuList = new ArrayList<>();

        skuList.sort((sku1, sku2) -> sku1.getSkuPrice() - sku2.getSkuPrice());

        //1.类名::静态方法名
        skuList.sort(Sku::staticComparePrice);
        //展开
        skuList.sort((sku1, sku2) -> {
            return Sku.staticComparePrice(sku1, sku2);
        });

        //2.对象::实例方法
        PriceCompare priceCompare = new PriceCompare();
        skuList.sort(priceCompare::instanceComparePrice);
        //展开
        skuList.sort((sku1, sku2) -> {
            return priceCompare.instanceComparePrice(sku1, sku2);
        });

        //3.类名::实例方法名
        skuList.sort(Sku::instanceComparePrice);
        //展开
        skuList.sort((object, sku) -> {
            return object.instanceComparePrice(sku);
        });

        //4.构造方法 --- 创建一个 ArrayList 对象
        Optional.ofNullable(skuList)
                .orElseGet(ArrayList::new);

    }

}
