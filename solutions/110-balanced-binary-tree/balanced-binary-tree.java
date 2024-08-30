class Solution {
    public boolean isBalanced(TreeNode root) {
        return dfs(root) != -1;
    }

    public int dfs(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftH = dfs(root.left);
        int rightH = dfs(root.right);

        if(Math.abs(leftH - rightH) > 1 || leftH == -1 || rightH == -1){
            return -1;
        }

        return 1 + Math.max(leftH, rightH);
    }

}