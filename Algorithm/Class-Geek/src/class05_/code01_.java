package class05_;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ajie
 * @Date: 2023/1/28
 * @Description: 二叉树的中序遍历
 * https://leetcode.cn/problems/binary-tree-inorder-traversal/description/
 */
public class code01_ {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2, new TreeNode(3), null);
        List<Integer> integers = inorderTraversal(root);
        System.out.println(integers);

    }

    private static List<Integer> seq;

    public static List<Integer> inorderTraversal(TreeNode root) {
        seq = new ArrayList<>();
        find(root);
        return seq;
    }

    public static void find(TreeNode root) {
        if (root == null) {
            return;
        }
        find(root.left);
        seq.add(root.val);
        find(root.right);
    }
}
