package class05_;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ajie
 * @Date: 2023/1/28
 * @Description: N 叉树的前序遍历
 * https://leetcode.cn/problems/n-ary-tree-preorder-traversal/description/
 */
public class code02_ {
    public static void main(String[] args) {
        Node root = new Node(1, new ArrayList<>());
        Node node1 = new Node(2, new ArrayList<>());
        Node node2 = new Node(3, new ArrayList<>());
        Node node3 = new Node(4, new ArrayList<>());
        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        List<Integer> preorder = preorder(root);
        System.out.println(preorder);
    }

    private static List<Integer> seq;

    public static List<Integer> preorder(Node root) {
        seq = new ArrayList<>();
        addVal(root);
        return seq;
    }

    public static void addVal(Node root) {
        if (root == null) {
            return;
        }
        seq.add(root.val);
        for (Node child : root.children) {
            addVal(child);
        }
    }
}
