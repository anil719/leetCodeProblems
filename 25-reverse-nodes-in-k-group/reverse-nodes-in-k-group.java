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
    public int llLength(ListNode node){
        int cnt = 0;
        while(node != null){
            cnt ++;
            node = node.next;
        }
        return cnt;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null) return head;
        int n = llLength(head);
        return helper(head, n, k);
    }

    public ListNode helper(ListNode head, int n, int k){
        if(n < k) return head;
         
        int cnt = k;
        ListNode prev = null, curr = head, ncxt = null;
        while(cnt != 0 && curr != null){
            ncxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ncxt;
            cnt --;
         }

        if(curr != null){
            head.next = helper(curr, n-k, k);
        }

        return prev;
    }
}