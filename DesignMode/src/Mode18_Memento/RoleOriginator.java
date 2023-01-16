package Mode18_Memento;

/**
 * 角色管理：发起者
 *
 * @Author: ajie
 * @Date: 2023/1/16
 */
public class RoleOriginator {
    private int live = 100;
    private int attack = 100;

    public int getLive() {
        return live;
    }

    public void setLive(int live) {
        this.live = live;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     * 信息展示
     */
    public void display() {
        System.out.println("======开始======");
        System.out.println("生命值：" + live);
        System.out.println("攻击力：" + attack);
        System.out.println("======结束======");
        System.out.println();
    }

    /**
     * 信息改变
     */
    public void change() {
        this.live = live - 10;
        this.attack = attack + 5;
    }

    /**
     * 创建快照
     *
     * @return
     */
    public RoleMessageMemento createMemento() {
        return new RoleMessageMemento(live, attack);
    }

    /**
     * 修改快照中的信息
     *
     * @param memento
     */
    public void recoverMemento(RoleMessageMemento memento) {
        this.live = memento.getLive();
        this.attack = memento.getAttack();
    }


}
