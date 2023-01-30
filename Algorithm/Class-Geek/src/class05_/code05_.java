package class05_;

/**
 * @Author: ajie
 * @Date: 2023/1/30
 * @Description: 从前序与中序遍历序列构造二叉树
 * https://leetcode.cn/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 */
public class code05_ {
    public static void main(String[] args) {

    }

    private int[] preorder;
    private int[] inorder;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;
        return build(0, preorder.length - 1, 0, inorder.length - 1);
    }

    public TreeNode build(int l1, int r1, int l2, int r2) {
        if (l1 > r1) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[l1]);
        int mid = 0;
        for (int i = 0; inorder[i] != preorder[l1]; i++) {
            mid++;
        }
        int leftSize = mid - l2;
        int rightSize = r2 - mid;
        root.left = build(l1 + 1, l1 + leftSize, l2, mid - 1);
        root.right = build(l1 + leftSize + 1, r1, mid + 1, r2);

        return root;
    }
}
