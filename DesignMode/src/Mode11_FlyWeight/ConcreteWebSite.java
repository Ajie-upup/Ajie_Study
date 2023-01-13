package Mode11_FlyWeight;

/**
 * @Author: ajie
 * @Date: 2023/1/13
 */
public class ConcreteWebSite extends CloudWebSite {

    private String category;

    public ConcreteWebSite(String category) {
        this.category = category;
    }

    @Override
    public void run(Company company) {
        System.out.println("网站分类：" + category + ",公司：" + company.getName());
    }
}
