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
    public ListNode gMiddle(ListNode head){
        if(head == null || head.next == null ) return head;

        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public void reorderList(ListNode head) {
        ListNode middle = gMiddle(head);
        ListNode head2 = middle.next;
        ListNode head1 = head;
        middle.next = null;

        head2 = reverse(head2);

        ListNode answer = new ListNode(-1);
        ListNode curr = answer;
        while(head1 != null && head2 != null){
            curr.next = head1;
            curr = curr.next;
            head1 = head1.next;

            curr.next = head2;
            curr = curr.next;
            head2 = head2.next;
        }
        if(head1 != null) {
         curr.next = head1;
         curr = curr.next;
         head1 = head1.next;
        }
        
        if(head2 != null) {
            curr.next = head2;
            curr = curr.next;
            head2 = head2.next;
        }
        head = answer.next;
    }
    public ListNode reverse(ListNode head2){
        if(head2 == null || head2.next == null) return head2;

        ListNode prev = null, curr = head2;
        while(curr != null){
            ListNode ncxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ncxt;
        }
        return prev;
    }
}
