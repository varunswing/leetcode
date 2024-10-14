/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
  public Node connect(Node root) {
    Node node = root; // 

    while (node != null) {
      Node dummy = new Node();
      for (Node needle = dummy; node != null; node = node.next) {
        if (node.left != null) {
          needle.next = node.left;
          needle = needle.next;
        }
        if (node.right != null) {
          needle.next = node.right;
          needle = needle.next;
        }
      }
      node = dummy.next; 
    }

    return root;
  }
}