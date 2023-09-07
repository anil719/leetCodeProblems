class Solution {
    public int firstMissingPositive(int[] nums) {
        
        // Arrays.sort(nums);                  //O(nlogn)
        // int missing = 1;
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] == missing) {
        //         missing++;
        //     } else if (nums[i] > missing) {
        //         return missing;
        //     }
        // }
        // return missing;


          int n = nums.length;                     // TC-->  O(n)        SC-->   O(n)
        //  boolean[] present = new boolean[n+1];
        //  for(int i : nums){
        //      if(i > 0 && i <= n) present[i] = true;
        //  }

        //  for(int i = 1; i <= n; i++){
        //      if(!present[i]) return i;
        //  }
        //  return n+1;




        // Iterate through the array and try to put each positive integer at its corresponding index

        for(int i = 0; i < n; i++){
            int x = nums[i];
            while(x > 0 && x <= n && nums[x-1] != x){
                int t = nums[x-1];
                nums[x-1] = x;
                x= t;
            }
        }

        // Find the first index that is not equal to its corresponding integer
        for(int i = 0; i < n; i++){
            if(nums[i] != i+1) return i+1;
        }

       // If all integers from 1 to n are present, return n+1
        return n+1;

    
    }
}