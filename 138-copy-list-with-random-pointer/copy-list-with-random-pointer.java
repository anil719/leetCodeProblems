/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        /*

        if(head == null) return head;
        Node curr = head;
        while(curr != null){
            Node ncxt = curr.next;
            Node copi = new Node(curr.val);
            curr.next = copi;
            copi.next = ncxt;
            curr = ncxt;
        }

        curr = head;
        while(curr != null){
            if(curr.next!= null) curr.next.random = curr.random != null ? curr.random.next : null;
            curr = curr.next.next;
        }

        Node temp = head, copi = head.next;
        Node ans = copi;
        while(temp != null){
            temp.next = temp.next.next;
            copi.next = copi.next != null ? copi.next.next : null ;
            temp = temp.next;
            copi = copi.next;
        }
        return ans;

        */


       Node curr = head;
       Map<Node, Node> hm = new HashMap<>();
       while(curr != null){
           Node copy = new Node(curr.val);
           hm.put(curr, copy);
           curr = curr.next;
       }

       curr = head;
       while(curr != null){
           Node copy = hm.get(curr);
           if(curr.next != null) copy.next = hm.get(curr.next);
           if(curr.random != null) copy.random = hm.get(curr.random);
           curr = curr.next;
       }
       return hm.get(head);
       
    }
}