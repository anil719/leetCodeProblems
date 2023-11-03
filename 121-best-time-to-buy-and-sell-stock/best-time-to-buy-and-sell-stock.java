class Solution {
    /*      TC --> O(n^2)  &&  SC--> O(1)
     public int maxProfit(int[] prices) {
        
        int n = prices.length;
        if(n == 0) return 0;
        int MaxProfit = Integer.MIN_VALUE;
      
        for(int i = 0; i < n; i++){
            int maxSellingPoint = prices[i];
            for(int j = i+1; j < n; j++){
                maxSellingPoint = Math.max(maxSellingPoint, prices[j]);
            }
            int profitOfSellingOnIthDay = maxSellingPoint - prices[i];
            MaxProfit = Math.max(MaxProfit, profitOfSellingOnIthDay );
        }

        return MaxProfit;
    }
    */

    //      TC --> O(n)  &&  SC--> O(1)

    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n == 0) return 0;
        int MaxProfit = 0;
      
        int minimumPrice = prices[0];
        for(int i = 1; i < n; i++){
           minimumPrice = Math.min(minimumPrice, prices[i]);
           int profitOfSellingToday = prices[i] - minimumPrice;
           MaxProfit = Math.max(MaxProfit, profitOfSellingToday);
        }
        return MaxProfit;
    }
}