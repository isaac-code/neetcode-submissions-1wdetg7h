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
    public void reorderList(ListNode head) {
        List<ListNode> arr = new ArrayList<>();

        ListNode curr = head;
        while (curr != null) {
            arr.add(curr);
            curr = curr.next;
        }

        int i = 0;
        int j = arr.size() - 1;

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (i <= j) {
            if (i != j) {
                tail.next = arr.get(i);
                tail = tail.next;

                tail.next = arr.get(j);
                tail = tail.next;
            } else {
                tail.next = arr.get(i);
                tail = tail.next;
            }
            i++;
            j--;
        }

        tail.next = null;
        head = dummy.next;
    }
}
