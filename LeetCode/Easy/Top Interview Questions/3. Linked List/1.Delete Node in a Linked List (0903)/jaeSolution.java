public class jaeSolution {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public void deleteNode(ListNode node) {
        //delete node
        //Input: head = [-3,5,-99], node = -3
        //Output: [5,-99]
        
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
