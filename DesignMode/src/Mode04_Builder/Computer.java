package Mode04_Builder;

/**
 * @Author: ajie
 * @Date: 2022/12/31
 */
public class Computer {
    /**
     * 内存
     */
    private String cpu;
    /**
     * 主板
     */
    private String mainBoard;
    /**
     * 磁盘
     */
    private String disk;

    /**
     * 电源
     */
    private String power;

    /**
     * 显卡
     */
    private String memory;

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                ", disk='" + disk + '\'' +
                ", power='" + power + '\'' +
                ", memory='" + memory + '\'' +
                '}';
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }
}
