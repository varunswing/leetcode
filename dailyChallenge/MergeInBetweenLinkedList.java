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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode start = list1;
        ListNode end = list1;
        while(a > 1){
            start = start.next;
            a--;
        }
        
        while(b >= 0){
            end = end.next;
            b--;
        }
        
        start.next = list2;
        while(list2.next != null){
            list2 = list2.next;
        }
        list2.next = end;
        
        return list1;
    }
}
