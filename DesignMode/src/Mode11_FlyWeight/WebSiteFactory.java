package Mode11_FlyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ajie
 * @Date: 2023/1/13
 */
public class WebSiteFactory {

    private Map<String, ConcreteWebSite> map = new HashMap<>();

    /**
     * 根据 key 获取分类站点
     *
     * @param category
     * @return
     */
    public CloudWebSite getConcreteWebSiteByCategory(String category) {
        if (map.containsKey(category)) {
            return map.get(category);
        } else {
            ConcreteWebSite site = new ConcreteWebSite(category);
            map.put(category, site);
            return site;
        }
    }

    /**
     * 获取站点的数量
     *
     * @return
     */
    public int getWebSiteCount() {
        return map.size();
    }


}
