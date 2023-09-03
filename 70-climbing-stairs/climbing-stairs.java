class Solution {
    // public int climbStairs(int n) {
    //    if(n == 1 || n== 2) return n;
    //    int[] dp = new int[n+1];
    //    dp[1] = 1;
    //    dp[2] = 2;
    //    for(int i = 3; i <= n; i++){
    //        dp[i] = dp[i-1] + dp[i-2];
    //    }
    //    return dp[n];
    // }


    public int climbStairs(int n) {
       if(n == 1 || n== 2) return n;
       
      int prv2 = 1;
      int prv1 = 2;
      int curr  = 0;
      for(int i = 3; i <=n; i++){
          curr = prv1 + prv2;
          prv2 = prv1;
          prv1 = curr;
      } 

      return curr;
    }
}