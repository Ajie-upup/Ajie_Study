package class05_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: ajie
 * @Date: 2023/1/30
 * @Description: 二叉树的序列化与反序列化
 * https://leetcode.cn/problems/serialize-and-deserialize-binary-tree/
 */
public class code04_ {
    public static void main(String[] args) {

    }

    private List<String> seq;

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        seq = new ArrayList<>();
        transform(root);
        return String.join(" ", seq);
    }

    private void transform(TreeNode node) {
        if (node == null) {
            seq.add(null);
            return;
        }
        //先序序列化
        seq.add(Integer.toString(node.val));
        transform(node.left);
        transform(node.right);
    }

    private int cur;

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        seq = Arrays.asList(data.split(" "));
        cur = 0;
        return cal();
    }

    private TreeNode cal() {
        if (seq.get(cur).equals("null")) {
            cur++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(seq.get(cur)));
        cur++;
        root.left = cal();
        root.right = cal();
        return root;
    }

}
