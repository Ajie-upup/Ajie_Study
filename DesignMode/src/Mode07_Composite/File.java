package Mode07_Composite;

/**
 * 基本的文件类，其下不包含其他文件
 *
 * @Author: ajie
 * @Date: 2023/1/12
 */
public class File extends Root {


    public File(String name) {
        super(name);
    }

    @Override
    public void addFile(Root root) {

    }

    @Override
    public void delete(Root root) {

    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(sb.toString() + this.getName());
    }
}
