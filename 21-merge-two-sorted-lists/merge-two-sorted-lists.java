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
    public ListNode mergeTwoLists(ListNode h1, ListNode h2) {
       if(h1 == null || h2 == null) return h1 == null ? h2 : h1;

       ListNode answer = new ListNode(-1);
       ListNode temp = answer;
       while(h1 != null && h2 != null){
           if(h1.val < h2.val){
               temp.next = h1;
               h1 = h1.next;
           }
           else {
               temp.next = h2;
               h2 = h2.next;
           }
           temp = temp.next;
       }

       if(h1 != null) temp.next = h1; 
       if(h2 != null) temp.next = h2; 

       return answer.next;
    }
}