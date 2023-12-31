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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
      if(subRoot == null) return true;
      if(root == null) return false;
      if(sameTree(root, subRoot)) return true;
      return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    public boolean sameTree(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        if(p== null || q == null) return false;
        boolean l = sameTree(p.left, q.left);
        boolean r = sameTree(p.right, q.right);
        return l && r && (p.val == q.val ) ;
    }
}