class Solution {
    //   T.C --> O(m*n) where m is the number of coin denominations, and n is the target amount S.C-->O(n) 

    public int coinChange(int[] coins, int tar) {
        
        int[] minCoins = new int[tar+1];

        for(int amt = 1; amt <= tar; amt ++){
            minCoins[amt] = Integer.MAX_VALUE;
            for(int coin : coins){
                if(coin <= amt && minCoins[amt-coin] != Integer.MAX_VALUE){
                    minCoins[amt] = Math.min(minCoins[amt], minCoins[amt-coin]+1);
                }
            }
        }

        if(minCoins[tar] == Integer.MAX_VALUE) return -1;
        return minCoins[tar];



        /*
         if (tar < 1) return 0;
         return minCoins(coins, tar);

        */
    }

    /*   T.C --> O(m^n) where m is the number of coin denominations, and n is the target amount.
         S.C-->O(n) 

     private int minCoins(int[] coins, int amt) {
        if (amt == 0) return 0;
        if (amt < 0) return -1;
        
        int minCount = Integer.MAX_VALUE;
        
        for (int coin : coins) {
            int subProblem = minCoins(coins, amt - coin);
            if (subProblem >= 0) {
                minCount = Math.min(minCount, subProblem + 1);
            }
        }
        
        return (minCount == Integer.MAX_VALUE) ? -1 : minCount;
     }

    */ 
}