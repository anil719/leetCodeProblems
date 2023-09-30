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
    public TreeNode pmapping(TreeNode root,Map<TreeNode, TreeNode> pmap, int start ){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        TreeNode target = null;
        while(!q.isEmpty()){
            int n = q.size();
            for(int i =0; i < n; i++){
                TreeNode curr = q.remove();
                if(curr.val == start ) target = curr;
                if(curr.left != null){
                    pmap.put(curr.left, curr);
                    q.add(curr.left);
                }
                if(curr.right != null){
                    pmap.put(curr.right, curr);
                    q.add(curr.right);
                }
            }
        }
        return target;
    }
    public int amountOfTime(TreeNode root, int start) {
        if(root == null) return 0;

        Map<TreeNode, TreeNode> pmap = new HashMap<>();
        TreeNode target = pmapping(root, pmap, start);

        return getTime(target, pmap);
    }

    public int getTime(TreeNode root, Map<TreeNode, TreeNode> pmap){
        Map<TreeNode, Boolean> burned = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int time = 0;
        burned.put(root, true);
        while(!q.isEmpty()){
            int n = q.size();
            boolean burn = false;
            for(int i = 0; i < n; i++){
                TreeNode curr = q.remove();
                if(curr.left != null && !burned.containsKey(curr.left)){
                    burned.put(curr.left, true);
                    q.add(curr.left);
                    burn = true;
                }
                if(curr.right != null && !burned.containsKey(curr.right)){
                    burned.put(curr.right, true);
                    q.add(curr.right);
                     burn = true;
                }
                TreeNode parent = pmap.get(curr);
                 if(parent != null && !burned.containsKey(parent)){
                    burned.put(parent, true);
                    q.add(parent);
                     burn = true;
                }
            }
            if(burn) time ++;
        } 
        return time;
    }
}