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
    public ListNode sortList(ListNode head) {
        PriorityQueue<Integer> set = new PriorityQueue<>();
        ListNode curr = head;
        while(curr != null){
            set.add(curr.val);
            curr = curr.next;
        }

        ListNode answer = new ListNode(-1);
        curr = answer ;
       while(!set.isEmpty()){
            curr.next = new ListNode(set.poll());
            curr = curr.next;
        }
        return answer.next;
    }
}