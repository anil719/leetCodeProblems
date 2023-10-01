class Solution {
    public int rob(int[] arr) {
        int n = arr.length;
        if(n == 1) return arr[0];
        if(n == 2) return Math.max(arr[0], arr[1]);


        int prev2 = 0, prev1 = arr[0];
        for(int i = 1; i < n; i++){
            int exc = prev1;
            int incl = prev2 + arr[i];
            int curr = Math.max(exc, incl);
            prev2 = prev1;
            prev1 = curr;
        } 
        return prev1;



       /// return helper(arr, 0);
    }
    // public int helper(int[] arr, int idx){
    //     int n = arr.length;
    //     if(idx > n-1) return 0;
    //     if(idx == n-1) return arr[idx];

    //     int inc = arr[idx] + helper(arr, idx + 2);
    //     int exc = helper(arr, idx + 1);
    //     return Math.max(inc, exc);
    // }

    //  public int rob(int[] arr) {
    //     int n = arr.length;
    //     if(n == 1) return arr[0];

    //     int[] dp = new int[n];
    //     dp[0] = arr[0];
    //     dp[1] = Math.max(arr[0], arr[1]);

    //     for(int i = 2; i < n; i++){
    //         int inc = dp[i-2] + arr[i];
    //         int exc = dp[i-1];
    //         dp[i] = Math.max(inc, exc);
    //     }
    //     return dp[n-1];
    // }
}