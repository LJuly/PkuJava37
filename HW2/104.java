/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int l1 = maxDepth(root.left);
        int l2 = maxDepth(root.right);
        return (1 + Math.max(l1,l2) );
    }
}