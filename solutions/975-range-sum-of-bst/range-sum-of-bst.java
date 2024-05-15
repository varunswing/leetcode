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
    public int rangeSumBST(TreeNode root, int low, int high) {
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        int ans = 0;
        while(q.size() > 0){
            TreeNode a = q.poll();
            if(a.val >= low && a.val <= high){
                ans+=a.val;
            }
            if(a.left != null){
                q.add(a.left);
            }
            if(a.right != null){
                q.add(a.right);
            }
        }
        return ans;
    }
}