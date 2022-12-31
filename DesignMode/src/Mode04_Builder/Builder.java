package Mode04_Builder;

/**
 * 声明抽象建造者，定义通用方法和构建方法
 *
 * @Author: ajie
 * @Date: 2022/12/31
 */
public interface Builder {
    /**
     * 通用⽅法
     */
    void buildCpu();

    void buildMainBoard();

    void buildDisk();

    void buildPower();

    void buildMemory();

    Computer createComputer();
}
