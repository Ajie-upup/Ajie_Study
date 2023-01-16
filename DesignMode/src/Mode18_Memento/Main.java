package Mode18_Memento;

/**
 * @Author: ajie
 * @Date: 2023/1/16
 */
public class Main {
    public static void main(String[] args) {
        //创建游戏对象
        RoleOriginator originator = new RoleOriginator();
        originator.display();

        //创建管理者，保存初始快照
        RoleMementoCaretaker caretaker = new RoleMementoCaretaker();
        RoleMessageMemento memento = originator.createMemento();
        System.out.println("========= 保存初始快照 =========");
        caretaker.setMemento(memento);

        originator.change();
        originator.change();
        originator.change();
        originator.change();
        //展示游戏对象修改后的属性
        originator.display();

        //恢复游戏初始快照
        RoleMessageMemento mementoAfter = caretaker.getMemento();
        originator.recoverMemento(mementoAfter);
        originator.display();

    }
}
