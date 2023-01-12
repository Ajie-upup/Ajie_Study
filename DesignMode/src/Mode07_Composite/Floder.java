package Mode07_Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的实现方法，文件夹类，可以包含文件夹和子文件
 *
 * @Author: ajie
 * @Date: 2023/1/12
 */
public class Floder extends Root {
    List<Root> floders = new ArrayList<>();

    public List<Root> getFloders() {
        return floders;
    }

    public void setFloders(List<Root> floders) {
        this.floders = floders;
    }

    public Floder(String name) {
        super(name);
    }

    @Override
    public void addFile(Root root) {
        floders.add(root);
    }

    @Override
    public void delete(Root root) {
        floders.remove(root);
    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(sb.toString() + this.getName());
        for (Root floder : floders) {
            floder.display(depth + 2);
        }
    }
}
