class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        if(n == 1) return 0;
        
        int minPrice = arr[0];
        int profit = Integer.MIN_VALUE;
        for(int i = 1; i < n; i++){
            minPrice = Math.min(minPrice, arr[i]);
            int cProfit = arr[i]-minPrice;
            profit = Math.max(profit, cProfit);
        }
        return profit;
    }
}