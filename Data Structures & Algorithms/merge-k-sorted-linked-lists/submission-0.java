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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> bulkList = new ArrayList<>();
        for (ListNode list : lists) {
            bulkList.addAll(sortListIntoArray(list));
        }
        Collections.sort(bulkList);

        ListNode dummy = new ListNode(0);
        ListNode newList = dummy;
        for (Integer value: bulkList) {
            newList.next = new ListNode(value);
            newList = newList.next;
        }

        return dummy.next;
    }

    public ArrayList<Integer> sortListIntoArray(ListNode head) {
        ListNode curr = head;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (curr != null) {
            arrayList.add(curr.val);
            curr = curr.next;
        }
        return arrayList;
    }
}
