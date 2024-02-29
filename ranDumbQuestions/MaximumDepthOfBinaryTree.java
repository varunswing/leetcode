class Solution {
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> ql = new LinkedList();
        if(root==null) return 0;
        int lh = 0;
        ql.add(root);
        while(ql.size() > 0){
            int l = ql.size();
            lh++;
            for(int i=0; i<l; i++){
                TreeNode a = ql.poll();
                if(a.left != null){
                    ql.add(a.left);
                }
                if(a.right != null){
                    ql.add(a.right);
                }
            }
        }
        
        return lh;
    }
}
