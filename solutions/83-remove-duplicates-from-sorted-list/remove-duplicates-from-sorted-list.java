/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        ListNode next = head;
        if(temp == null || temp.next == null){
            return head;
        }
        while(temp != null){
            if(temp == head){
                prev = temp;
                temp = temp.next;
            }
            if(prev.val == temp.val){
                temp = temp.next;
                prev.next = temp;
            }else{
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }
}