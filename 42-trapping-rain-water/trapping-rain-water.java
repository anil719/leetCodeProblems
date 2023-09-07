class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        int[] larr = new int[n];
        larr[0] = arr[0];
        for(int i = 1; i < n; i++) larr[i] = Math.max(larr[i-1], arr[i]);

        int[] rarr = new int[n];
        rarr[n-1] = arr[n-1];
        for(int i = n-2; i >= 0; i--) rarr[i] = Math.max(arr[i], rarr[i+1]);

        int water = 0;

        for(int i = 0; i < n; i++){
            int cw = Math.min(larr[i], rarr[i])-arr[i];
            water += cw;
        }
        return water;
    }
}