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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }

        while(head != null && head.val == val){
            head = head.next;
        }

        ListNode temp = head;
        ListNode prev = head;

        while(temp != null){
            if(temp.val != val){
                if(temp != head){
                    prev.next = temp;
                    prev = temp;
                }
            }
            temp = temp.next;
        }
        if(prev != null){
            prev.next = temp;
        }
        System.gc();

        return head;
    }
}