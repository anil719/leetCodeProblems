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
    int idx = 0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        idx = inorder.length-1;
        TreeNode root = formTree(inorder, postorder, 0, idx);
        return root;
    }
    public TreeNode formTree(int[] inorder, int[] postorder, int start, int end){
        if(idx < 0 || start > end ) return null;
        int data = postorder[idx];
        TreeNode root = new TreeNode(data);
        idx --;
        int i = start;
        for(; i <= end; i++){
            if(inorder[i] == data) break;
        }
        root.right = formTree(inorder, postorder, i+1, end);
        root.left = formTree(inorder, postorder, start, i-1);
        return root;
    }
}