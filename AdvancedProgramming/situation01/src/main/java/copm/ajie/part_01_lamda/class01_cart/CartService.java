package copm.ajie.part_01_lamda.class01_cart;

import java.util.ArrayList;
import java.util.List;

/**
 * 购物车服务类
 *
 * @Author: ajie
 * @Date: 2022/12/30
 */
public class CartService {
    // 加入到购物车中的商品信息
    private static List<Sku> cartSkuList = new ArrayList<Sku>() {
        {
            add(new Sku(654032, "无人机",
                    4999.00, 1,
                    4999.00, SkuCategoryEnum.ELECTRONICS));

            add(new Sku(642934, "VR一体机",
                    2299.00, 1,
                    2299.00, SkuCategoryEnum.ELECTRONICS));

            add(new Sku(645321, "纯色衬衫",
                    409.00, 3,
                    1227.00, SkuCategoryEnum.CLOTHING));

            add(new Sku(654327, "牛仔裤",
                    528.00, 1,
                    528.00, SkuCategoryEnum.CLOTHING));

            add(new Sku(675489, "跑步机",
                    2699.00, 1,
                    2699.00, SkuCategoryEnum.SPORTS));

            add(new Sku(644564, "Java编程思想",
                    79.80, 1,
                    79.80, SkuCategoryEnum.BOOKS));

            add(new Sku(678678, "Java核心技术",
                    149.00, 1,
                    149.00, SkuCategoryEnum.BOOKS));

            add(new Sku(697894, "算法",
                    78.20, 1,
                    78.20, SkuCategoryEnum.BOOKS));

            add(new Sku(696968, "TensorFlow进阶指南",
                    85.10, 1,
                    85.10, SkuCategoryEnum.BOOKS));
        }
    };

    /**
     * 获取商品信息列表
     *
     * @return
     */
    public static List<Sku> getCartSkuList() {
        return cartSkuList;
    }

    /**
     * Version 1.0.0
     * 找出购物车中所有的电子产品
     *
     * @param cartSkuList
     * @return
     */
    public static List<Sku> filterElectronicsSkus(List<Sku> cartSkuList) {
        List<Sku> result = new ArrayList<>();
        for (Sku sku : cartSkuList) {
            if (SkuCategoryEnum.ELECTRONICS.equals(sku.getSkuCategory())) {
                result.add(sku);
            }
        }
        return result;
    }

    /**
     * Version 2.0.0
     * 根据商品类型查询购物车中同类型的商品
     *
     * @param cartSkuList
     * @return
     */
    public static List<Sku> filterSkuByCategory(List<Sku> cartSkuList, SkuCategoryEnum category) {
        List<Sku> result = new ArrayList<>();
        for (Sku sku : cartSkuList) {
            if (category.equals(sku.getSkuCategory())) {
                result.add(sku);
            }
        }
        return result;
    }

    /**
     * 根据商品类型或者商品价格过滤商品
     *
     * @param cartSkuList
     * @param category
     * @param totalPrice
     * @param categoryOrPrice true：根据商品类型过滤，false：根据商品价格过滤
     * @return
     */
    public static List<Sku> filterSkuByCategoryOrPrice(List<Sku> cartSkuList,
                                                       SkuCategoryEnum category,
                                                       Double totalPrice,
                                                       Boolean categoryOrPrice) {

        List<Sku> result = new ArrayList<>();
        for (Sku sku : cartSkuList) {

            if ((categoryOrPrice && category.equals(sku.getSkuCategory()))
                    || ((!categoryOrPrice) && sku.getTotalPrice() > totalPrice)) {
                result.add(sku);
            }
        }
        return result;
    }

    /**
     * 根据不同的策略筛选商品
     *
     * @param cartSkuList
     * @param predicate
     * @return
     */
    public static List<Sku> filterSku(List<Sku> cartSkuList, SkuPredicate predicate) {
        List<Sku> result = new ArrayList<>();
        for (Sku sku : cartSkuList) {
            if (predicate.skeHandler(sku)) {
                result.add(sku);
            }
        }
        return result;
    }


}
