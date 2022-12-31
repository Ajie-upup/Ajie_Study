package Mode04_Builder;

/**
 * @Author: ajie
 * @Date: 2022/12/31
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        Computer lowComputer = director.create(new LowComputerBuilder());
        System.out.println(lowComputer.toString());

        Computer highComputer = director.create(new HighComputerBuilder());
        System.out.println(highComputer.toString());

    }
}
