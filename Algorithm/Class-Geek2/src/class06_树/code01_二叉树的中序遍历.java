package class06_树;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ajie
 * @Date: 2023/2/28
 * @Description: https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 */
public class code01_二叉树的中序遍历 {
    private List<Integer> seq;

    public List<Integer> inorderTraversal(TreeNode root) {
        seq = new ArrayList<>();
        findNode(root);
        return seq;
    }

    /**
     * 使用递归的方式将子树的根节点加入到链表中
     *
     * @param root
     */
    public void findNode(TreeNode root) {
        if (root == null) {
            return;
        }
        findNode(root.left);
        seq.add(root.val);
        findNode(root.right);
    }

}
