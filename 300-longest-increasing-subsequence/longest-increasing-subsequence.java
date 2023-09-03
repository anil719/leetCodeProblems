class Solution {
    public int lengthOfLIS(int[] arr) {
        TreeSet<Integer> bst = new TreeSet<>();
        for(int num : arr){
            Integer ge = bst.ceiling(num);
            if(ge == null) bst.add(num);
            else {
                bst.remove(ge);
                bst.add(num);
            }
        }
        return bst.size();
    }
}