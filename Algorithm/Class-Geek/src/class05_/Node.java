package class05_;

import java.util.List;

/**
 * @Author: ajie
 * @Date: 2023/1/28
 * @Description: N 叉树
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
