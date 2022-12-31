package Mode04_Builder;

/**
 * @Author: ajie
 * @Date: 2022/12/31
 */
public class HighComputerBuilder implements Builder {

    private Computer computer = new Computer();

    @Override
    public void buildCpu() {
        computer.setCpu("高配 Cpu");
    }

    @Override
    public void buildMainBoard() {
        computer.setMainBoard("高配 MainBoard");
    }

    @Override
    public void buildDisk() {
        computer.setDisk("高配 Disk");
    }

    @Override
    public void buildPower() {
        computer.setPower("高配 Power");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("高配 Memory");
    }

    @Override
    public Computer createComputer() {
        return computer;
    }
}
