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
    int pos = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
      pos = 0;
      TreeNode root = formTree(preorder, inorder, 0, inorder.length-1);
      return root;  
    }
   
    public TreeNode formTree(int[] pre, int[] ino, int start, int end){
        if(start > end || pos >= ino.length) return null;
        
        int val = pre[pos];
        TreeNode root = new TreeNode(val);
        pos++;
        int i = start;
        for(; i <= end ; i++){
            if(ino[i] == val) break;
        }
        
        root.left = formTree(pre, ino, start, i-1);
        root.right = formTree(pre, ino, i+1, end);
        return root;
    }
}