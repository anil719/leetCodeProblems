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
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        if(head1 == null || head2 == null) return head1 == null ? head2 : head1;

        ListNode answerNode = new ListNode(-1);
        ListNode curr = answerNode;

        while(head1 != null && head2 != null){
            if(head1.val < head2.val){
                curr.next = head1;
                head1 = head1.next;
            }
            else {
                curr.next = head2;
                head2 = head2.next;
            }
            curr = curr.next;
        }

        if(head1 != null) curr.next = head1;
        if(head2 != null) curr.next = head2;

        return answerNode.next;
    }
}