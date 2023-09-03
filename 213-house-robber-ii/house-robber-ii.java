class Solution {
    public int rob(int[] arr) {
        int n = arr.length;
        if(n == 1) return arr[0];
        int[] first = new int[n];
        int[] second = new int[n];
        for(int i = 0; i < n; i++){
            if(i != 0) first[i] = arr[i];
            if(i != n-1) second[i] = arr[i];
        }

        int fsoln = helper(first);
        int ssoln = helper(second);
        return Math.max(fsoln, ssoln);
    }
    public int helper(int[] arr){
        // int n = arr.length;
        // if(n == 1) return arr[0];

        // int prev2 = 0;
        // int prev1 = arr[0];
        // for(int i = 1; i < n; i++){
        //     int incl = prev2 + arr[i] ;
        //     int excl = prev1;
        //     int ans = Math.max(incl, excl);
        //     prev2 = prev1;
        //     prev1 = ans;
        // }
        // return prev1;


         int n = arr.length;
        if(n == 1) return arr[0];

        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);

        for(int i = 2; i < n; i++){
            int inc = dp[i-2] + arr[i];
            int exc = dp[i-1];
            dp[i] = Math.max(inc, exc);
        }
        return dp[n-1];
    }
}