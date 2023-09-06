class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;

        int[] dist = new int[n];
        Arrays.fill(dist, 1);

        for(int i = 1; i < n; i++){
            if(ratings[i-1] < ratings[i] ) dist[i] = dist[i-1] + 1;
        }

        int[] right = new int[n];
        Arrays.fill(right, 1);

        for(int i = n-2; i >= 0; i--){
            if(ratings[i] > ratings[i+1] ) right[i] = right[i+1] + 1;
        }
        int candies = 0;
        for(int i = 0; i < n; i++){
            candies += Math.max(right[i], dist[i]);
        }

        return candies;
    }
}