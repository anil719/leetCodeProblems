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
    int mps;
    public int maxPathSum(TreeNode root) {
        mps = Integer.MIN_VALUE;
        getMPS(root);
        return mps;
    }
    public int getMPS(TreeNode root){
        if(root == null) return 0;

        int l = Math.max(0,getMPS(root.left))   ;
        int r = Math.max(0,getMPS(root.right))   ;

        mps = Math.max(mps, root.val + l + r);
        return root.val + Math.max(l, r);
    }
}