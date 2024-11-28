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

    Set<Integer> ans = new TreeSet();

    public int minDiffInBST(TreeNode root) {
        if(root == null){
            return 0;
        }
        ans.add(root.val);

        dfs(root.left, ans);

        dfs(root.right, ans);

        int res = Integer.MAX_VALUE;

        Integer prev = null;
        for(Integer i : ans){
            if(prev != null){
                res = Math.min(res, Math.abs(i - prev));
            }
            prev = i;
            
        }

        return res;
    }

    public void dfs(TreeNode root, Set<Integer> ans){
        if(root == null){
            return;
        }
        ans.add(root.val);

        dfs(root.left, ans);
        dfs(root.right, ans);
    }
}