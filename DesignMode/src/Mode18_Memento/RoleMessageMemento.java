package Mode18_Memento;

/**
 * @Author: ajie
 * @Date: 2023/1/16
 */
public class RoleMessageMemento {
    private int live = 100;
    private int attack = 100;

    public RoleMessageMemento(int live, int attack) {
        this.live = live;
        this.attack = attack;
    }

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

}
