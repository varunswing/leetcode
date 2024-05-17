/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Queue<TreeNode> q = new LinkedList();
        Queue<TreeNode> q1 = new LinkedList();
        
        q.add(original);
        q1.add(cloned);
        
        while(q.size() > 0){
            TreeNode a = q.poll();
            TreeNode b = q1.poll();
            if(a == target){
                return b;
            }
            if(a.left != null){
                q.add(a.left);
                q1.add(b.left);
            }
            if(a.right != null){
                q.add(a.right);
                q1.add(b.right);
            }
        }
        return target;
    }
}