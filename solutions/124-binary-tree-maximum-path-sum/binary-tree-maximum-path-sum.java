/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxSum = Integer.MIN_VALUE;
    public int solve(TreeNode root){
        if(root == null){
            return 0;
        }

        int l = solve(root.left);
        int r = solve(root.right);

        int lmaxRmax = l+r+root.val;
        int lMaxOrRMax = Math.max(l, r) + root.val;
        maxSum = Math.max(Math.max(lmaxRmax, root.val), Math.max(maxSum, lMaxOrRMax));

        return Math.max(lMaxOrRMax, root.val);
    }

    public int maxPathSum(TreeNode root) {
        if(root == null) return 0;
        solve(root);
        return maxSum;
    }
}