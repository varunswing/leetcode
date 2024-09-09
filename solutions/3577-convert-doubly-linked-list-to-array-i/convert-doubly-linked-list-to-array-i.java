/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
};
*/

class Solution {
    public int[] toArray(Node head) {
        List<Integer> ans = new ArrayList();

        int i=0;
        while(head != null){
            ans.add(head.val);
            head = head.next;
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}