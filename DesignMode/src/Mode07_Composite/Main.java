package Mode07_Composite;

/**
 * @Author: ajie
 * @Date: 2023/1/12
 */
public class Main {
    public static void main(String[] args) {
        Root root1 = new Floder("C:");

        Root desktop = new Floder("桌面");
        Root myComputer = new Floder("我的电脑");

        Root javaFile = new File("HelloWorld.java");

        root1.addFile(desktop);
        root1.addFile(myComputer);

        myComputer.addFile(javaFile);

        root1.display(0);


    }
}
