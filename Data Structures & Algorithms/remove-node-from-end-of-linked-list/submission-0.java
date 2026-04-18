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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode curr = head;

        while (curr != null) {
            curr = curr.next;
            count++;
        }

        int popPosition = count - n;

        if (popPosition == 0) {
            return head.next;
        }

        curr = head;
        count = 0;
        while (curr != null) {
            count++;
            if (count == popPosition) {
                curr.next = curr.next.next;
                break;
            }
            curr = curr.next;
        }

        return head;
    }
}
