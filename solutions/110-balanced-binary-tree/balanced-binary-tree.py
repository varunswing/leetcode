# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        def dfs(node):
            if not node:
                return 0
            leftDepth = dfs(node.left)
            rightDepth = dfs(node.right)
            if leftDepth == -1 or rightDepth == -1:
                return -1
            if abs(leftDepth - rightDepth) > 1:
                return -1
            return max(leftDepth, rightDepth) + 1
        isBalanced = dfs(root)
        if isBalanced == -1: return False
        return True