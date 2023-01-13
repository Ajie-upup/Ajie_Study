package Mode11_FlyWeight;

/**
 * @Author: ajie
 * @Date: 2023/1/13
 */
public class Main {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();

        CloudWebSite webSite1 = factory.getConcreteWebSiteByCategory("企业官网");
        webSite1.run(new Company("ajie 2022"));

        CloudWebSite webSite2 = factory.getConcreteWebSiteByCategory("企业官网");
        webSite2.run(new Company("ajie 2023"));

        CloudWebSite webSite3 = factory.getConcreteWebSiteByCategory("后台服务");
        webSite3.run(new Company("bijian 2022"));

        CloudWebSite webSite4 = factory.getConcreteWebSiteByCategory("后台服务");
        webSite4.run(new Company("bijian 2023"));

        System.out.println("网站总数：" + factory.getWebSiteCount());
    }
}
