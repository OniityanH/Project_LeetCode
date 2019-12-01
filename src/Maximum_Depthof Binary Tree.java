import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        } else {
            int l = maxDepth(root.left);
            int r = maxDepth(root.right);
            if (l > r) {
                return 1 + l;
            } else {
                return 1 + r;
            }
        }
    }
}