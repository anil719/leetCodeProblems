class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;

        int chunk = 0;
        int max = 0;
        for(int i = 0; i < n; i++){
            max = Math.max(max, arr[i]);
            if(i == max) chunk ++;
        }
        return chunk;
    }
}