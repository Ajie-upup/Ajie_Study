package Mode04_Builder;

/**
 * @Author: ajie
 * @Date: 2022/12/31
 */
public class LowComputerBuilder implements Builder {

    private Computer computer = new Computer();

    @Override
    public void buildCpu() {
        computer.setCpu("低配 Cpu");
    }

    @Override
    public void buildMainBoard() {
        computer.setMainBoard("低配 MainBoard");
    }

    @Override
    public void buildDisk() {
        computer.setDisk("低配 Disk");
    }

    @Override
    public void buildPower() {
        computer.setPower("低配 Power");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("低配 Memory");
    }

    @Override
    public Computer createComputer() {
        return computer;
    }
}
