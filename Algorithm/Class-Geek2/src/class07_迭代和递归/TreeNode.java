package class07_迭代和递归;

/**
 * @Author: ajie
 * @Date: 2023/3/2
 * @Description: 二叉树的节点（树经常使用递归）
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
