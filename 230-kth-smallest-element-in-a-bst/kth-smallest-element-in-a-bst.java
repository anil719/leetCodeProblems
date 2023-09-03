/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int tracker ;
    int answer = -1;
    public int kthSmallest(TreeNode root, int k) {
        tracker = 0;
        inOrder(root, k);
        return answer;
    }
    public void inOrder(TreeNode root, int k){
        if(root == null) return ;

        inOrder(root.left, k);
        tracker ++;
        if(tracker == k){
            answer = root.val;
            return;
        }
        inOrder(root.right, k);
    }
}