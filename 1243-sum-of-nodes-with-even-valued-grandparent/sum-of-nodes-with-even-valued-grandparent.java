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
    public int sumEvenGrandparent(TreeNode root) {
        if(root == null) return 0;

        int a = 0, b = 0, c = 0, d = 0;
        if(root.val % 2 == 0){
            if(root.left != null){
                if(root.left.left != null)  a = root.left.left.val;
                if(root.left.right != null) b = root.left.right.val ;
            }
            if(root.right != null){
                if(root.right.left != null) c = root.right.left.val;
                if(root.right.right != null) d = root.right.right.val;
            }
        }
        return a + b + c + d + sumEvenGrandparent(root.left) + sumEvenGrandparent(root.right);
    }
}