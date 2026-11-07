/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode t1 = l1;
        ListNode t2 = l2;

        // Create dummy node
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        int carry = 0;

        while (t1 != null || t2 != null) {

            int sum = carry;

            if (t1 != null) {
                sum += t1.val;
            }

            if (t2 != null) {
                sum += t2.val;
            }

            // Create new node
            ListNode newNode = new ListNode(sum % 10);

            // Update carry
            carry = sum / 10;

            // Connect new node
            curr.next = newNode;
            curr = curr.next;

            // Move pointers
            if (t1 != null) {
                t1 = t1.next;
            }

            if (t2 != null) {
                t2 = t2.next;
            }
        }

        // Handle remaining carry
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return dummy.next;
    }
}