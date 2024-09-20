/**
 * Definition for polynomial singly-linked list.
 * class PolyNode {
 *     int coefficient, power;
 *     PolyNode next = null;
 
 *     PolyNode() {}
 *     PolyNode(int x, int y) { this.coefficient = x; this.power = y; }
 *     PolyNode(int x, int y, PolyNode next) { this.coefficient = x; this.power = y; this.next = next; }
 * }
 */

class Solution {
    public PolyNode addPoly(PolyNode poly1, PolyNode poly2) {
        PolyNode a = new PolyNode();
        PolyNode curr = a;
        PolyNode p = poly1;
        PolyNode q = poly2;

        while(p!=null && q!=null){
            if(p.power > q.power){
                curr.next = new PolyNode(p.coefficient, p.power);
                p = p.next;
                curr = curr.next;
            }else if(p.power < q.power){
                curr.next = new PolyNode(q.coefficient, q.power);
                q = q.next;
                curr = curr.next;
            }else{
                int sum = q.coefficient + p.coefficient;
                if(sum != 0){
                    curr.next = new PolyNode(sum, p.power);
                    curr = curr.next;
                }
                q = q.next;
                p = p.next;
            }
        }

        while(p!=null){
            curr.next = new PolyNode(p.coefficient, p.power);
            p = p.next;
            curr = curr.next;
        }

        while(q!=null){
            curr.next = new PolyNode(q.coefficient, q.power);
            q = q.next;
            curr = curr.next;
        }

        return a.next;

    }
}