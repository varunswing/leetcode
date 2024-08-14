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
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        int a = checkH(root.left);
        int b = checkH(root.right);
        if(Math.abs(a-b) > 1){
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);

    }

    public int checkH(TreeNode root){
        if(root == null){
            return 0;
        }

        return 1 + Math.max(checkH(root.left), checkH(root.right));
    }
}