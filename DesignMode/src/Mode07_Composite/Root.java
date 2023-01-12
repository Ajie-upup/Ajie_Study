package Mode07_Composite;

/**
 * 抽象根节点，包含通用的属性和方法
 *
 * @Author: ajie
 * @Date: 2023/1/12
 */
public abstract class Root {
    public String name;

    public Root(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void addFile(Root root);

    public abstract void delete(Root root);

    public abstract void display(int depth);
}
