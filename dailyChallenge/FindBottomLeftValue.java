class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> ql = new LinkedList();
        if(root==null) return 0;
        TreeNode a = root;
        ql.add(root);
        while(ql.size() > 0){
            a = ql.poll();
            if(a.right != null){
                ql.add(a.right);
            }
            if(a.left != null){
                ql.add(a.left);
            }
    }
        
        return a.val;
    }
}
