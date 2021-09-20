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
    public boolean isPalindrome(ListNode head) {
        ListNode f = head; 
        ListNode s = head;
        ListNode prev = null;
        ListNode curr = head;
        
        while(f != null && f.next != null){
            curr = s;
            f = f.next.next;
            s = s.next;
            curr.next = prev;
            prev = curr;
        }
        if(f != null)
            s = s.next;
        while(s != null && curr != null){
            if(s.val != curr.val)
                return false;
            s = s.next;
            curr = curr.next;
        }
        return true;
    }
}
