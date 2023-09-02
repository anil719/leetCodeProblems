class Solution {
    public boolean containsDuplicate(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> hm  = new HashMap<>();
        for(int i : arr) hm.put(i, hm.getOrDefault(i, 0)+1);

        for(int i : arr) if(hm.get(i) > 1) return true;

        return false;
    }
}