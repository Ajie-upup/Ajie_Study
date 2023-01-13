package Mode11_FlyWeight;

/**
 * 具体的外部公司
 *
 * @Author: ajie
 * @Date: 2023/1/13
 */
public class Company {
    private String name;

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
