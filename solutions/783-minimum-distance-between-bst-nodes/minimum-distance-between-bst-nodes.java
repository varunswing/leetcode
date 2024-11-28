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

    List<Integer> ans = new ArrayList<>();

    public int minDiffInBST(TreeNode root) {
        if(root == null){
            return 0;
        }
        ans.add(root.val);

        dfs(root.left, ans);

        dfs(root.right, ans);

        Collections.sort(ans);

        int res = Integer.MAX_VALUE;

        for(int i=0; i<ans.size()-1; i++){
            res = Math.min(res, Math.abs(ans.get(i) - ans.get(i+1)));
        }

        return res;
    }

    public void dfs(TreeNode root, List<Integer> ans){
        if(root == null){
            return;
        }
        ans.add(root.val);

        dfs(root.left, ans);
        dfs(root.right, ans);
    }
}