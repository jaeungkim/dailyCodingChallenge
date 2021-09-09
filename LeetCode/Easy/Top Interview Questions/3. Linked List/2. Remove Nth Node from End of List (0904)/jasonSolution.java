/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode copy = head;
        // Checking the length of the list
        while(copy != null){
            len++;
            copy = copy.next;
        }
        if(len == n)
            return head.next;
        // Nth node
        len -= n;
        
        copy = head;
        for(int i = 0; i < len-1; i++)
            copy = copy.next;
        
        copy.next = copy.next.next;
        return head;
    }
}
