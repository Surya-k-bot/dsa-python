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
    private static int size(ListNode t) {
        int cnt = 0;
        while (t != null) {
            cnt++;
            t = t.next;
        }
        return cnt;
    }
    private static ListNode dltKthElm(ListNode t, int k) {
        ListNode temp = t;
        int s = size(t);
        int cnt = 1;
        while (cnt < k - 1) {
            temp = temp.next;
            cnt++;
        }
        temp.next = temp.next.next;
        return t;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
         if (head == null || head.next == null)
            return null;
            int s = size(head);
            if(s-n==0){
                return head.next;
            }
            return dltKthElm(head,s-n+1);
    }
}