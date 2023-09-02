class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0];
        int currMaxSum = nums[0];
        for(int i = 1; i < n; i++){
            currMaxSum = Math.max(currMaxSum+nums[i], nums[i] );
            maxSum = Math.max(maxSum, currMaxSum );
        }
        return maxSum;
    }
}