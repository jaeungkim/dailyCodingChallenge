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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if(l1 == null && l2 == null)
            return l1;
        
        ListNode head = null;
        ListNode curr = null;
        if(checkVal(l1) > checkVal(l2)){
            head = l2;
            curr = l2;
            l2 = l2.next;
        }
        else {
            head = l1;
            curr = l1;
            l1 = l1.next;
        }
        while(l1 != null || l2 != null){
            if(checkVal(l1) < checkVal(l2)){
                curr.next = l1;
                l1 = l1.next;
            }
            else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        return head;
    }
    
    public int checkVal(ListNode node){
        if(node == null)
            return 101;
        return node.val;
    }
}
