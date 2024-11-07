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
    public TreeNode increasingBST(TreeNode root) {

        return bst(root, null);
    }


    public TreeNode bst(TreeNode root, TreeNode temp){
        if(root == null){
            return temp;
        }

        TreeNode tail = bst(root.left, root);
        root.left = null;
        root.right = bst(root.right, temp);

        return tail;
    }
}

