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
        // T.C --> O(n)         S.C -->  O(n)

class Solution {
    int answer = 0;
    public int pseudoPalindromicPaths (TreeNode root) {
       if(root == null ) return 0;

       int[] freq = new int[10];
       dfs(root, freq);
       return answer;
    }
    public void dfs(TreeNode root, int[] arr){
        if(root == null) return ;
        arr[root.val] ++;
        if(root.left == null && root.right == null){
            if(pal(arr)) answer ++;
        }

        dfs(root.left, arr);
        dfs(root.right, arr);
         arr[root.val] --;
    }
    public boolean pal(int[] arr){
        int oddCount = 0;
        for(int i : arr) if(i % 2 != 0) oddCount ++;

        return oddCount <= 1;
    }
}