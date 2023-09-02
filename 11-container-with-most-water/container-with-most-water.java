class Solution {
    public int maxArea(int[] height) {
        int n = height.length;

        int left = 0, right = n-1;
        int res = Integer.MIN_VALUE;
        while(left <= right){
            int ht = Math.min(height[left], height[right]);
            int currArea = (right-left) * ht;
            res = Math.max(res, currArea);

            if(height[left] < height[right]) left ++;
            else right--;
        }
        return res;
    }
}