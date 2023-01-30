package class05_;

import javafx.util.Pair;

import java.util.*;

/**
 * @Author: ajie
 * @Date: 2023/1/30
 * @Description: N 叉树的层序遍历
 * https://leetcode.cn/problems/n-ary-tree-level-order-traversal/
 */
public class code03_ {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> seq = new ArrayList<>();
        Queue<Pair<Node, Integer>> q = new LinkedList<>();
        q.add(new Pair<>(root, 0));
        while (!q.isEmpty()) {
            Node node = q.peek().getKey();
            Integer depth = q.poll().getValue();
            if (node == null) {
                break;
            }
            if (seq.size() <= depth) {
                seq.add(new ArrayList<Integer>());
            }
            seq.get(depth).add(node.val);

            for (Node child : node.children) {
                q.add(new Pair<>(child, depth + 1));
            }
        }
        return seq;
    }

}
