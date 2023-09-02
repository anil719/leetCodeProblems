class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        int id1 = -1, id2 = -1;
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(hm.containsKey(target-arr[i])){
                id1 = hm.get(target-arr[i]);
                id2 = i;
            }
           else hm.put(arr[i], i);
        }
        int[] arr1 = {id1, id2};
        return arr1;
    }
}