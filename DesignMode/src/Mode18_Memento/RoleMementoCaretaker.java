package Mode18_Memento;

/**
 * 快照管理者
 *
 * @Author: ajie
 * @Date: 2023/1/16
 */
public class RoleMementoCaretaker {
    private RoleMessageMemento memento;

    public RoleMessageMemento getMemento() {
        return memento;
    }

    public void setMemento(RoleMessageMemento memento) {
        this.memento = memento;
    }
}
