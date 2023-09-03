class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < (1<< n)  ; i++){
            List<Integer> set = new ArrayList<>();
            for(int j = 0; j < n; j++){
                int setbit = (i & (1<<j)) ;
                if(setbit != 0) set.add(nums[j]);
            }
            answer.add(set);
        }
        return answer;
    }
  
}


// T.C --> O(n * 2 ^ n)

// S.C --> O(n)      