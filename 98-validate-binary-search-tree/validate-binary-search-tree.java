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
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);   
    }

    public boolean helper(TreeNode root, long minVal, long maxVal){
        if(root == null) return true;

        int cVal = root.val;
        if(cVal <= minVal || cVal >= maxVal) return false;

        return helper(root.left, minVal, cVal) && helper(root.right, cVal, maxVal);
    }
}