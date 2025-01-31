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
    public ListNode frequenciesOfElements(ListNode head) {
        int[] f = new int[100001];

        ListNode res = new ListNode(0);
        ListNode temp = res;

        while(head!=null){
            f[head.val]++;
            head = head.next;
        }

        for(int i=0; i<100001; i++){
            if(f[i] > 0){
                ListNode a = new ListNode(f[i]);
                if(res.val == 0){
                    res = a;
                    temp = res;
                }else{
                    res.next = a;
                    res = res.next;
                }
            }
        }

        return temp;
        
    }
}