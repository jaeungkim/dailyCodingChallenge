/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        while(head != null && fast != null && fast.next != null){
            head = head.next;
            fast = fast.next.next;
            if(fast == null)
                return false;
            if(head == fast)
                return true;
        }
        return false;
    }
}
