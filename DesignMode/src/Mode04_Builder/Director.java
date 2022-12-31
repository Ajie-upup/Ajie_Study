package Mode04_Builder;

/**
 * 将产品和创建过程进行解耦，使用相同的创建过程创建不同的产品，控制产品的生产过程
 * Director 是全程知道组装过程，具体的细节还是 builder 去操作
 *
 * @Author: ajie
 * @Date: 2022/12/31
 */
public class Director {
    public Computer create(Builder builder) {

        builder.buildCpu();
        builder.buildDisk();
        builder.buildMainBoard();
        builder.buildMemory();
        builder.buildPower();

        return builder.createComputer();
    }
}
