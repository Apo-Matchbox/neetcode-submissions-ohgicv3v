// recursive

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
    public ListNode reverseList(ListNode head) {
        ListNode previous_node = null;
        ListNode current_node = head;

        while (current_node != null) {
            ListNode temp = current_node.next;
            current_node.next = previous_node;
            previous_node = current_node;
            current_node = temp;            
        }
        return previous_node;
    }
}

// T(n)
// M(1)