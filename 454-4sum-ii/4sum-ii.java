class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
    //     int cnt = 0;
    //     Map<Integer, Integer> hm = new HashMap<>();
    //     for(int i : nums3){
    //         for(int j : nums4){
    //             hm.put(i+j, hm.getOrDefault(i+j, 0)+1) ;
    //         }
    //     }

    //     for(int a : nums1){
    //         for(int b : nums2){
    //                cnt += hm.getOrDefault(-(a+b), 0) ;
    //         }
    //     }
    //     return cnt;


    // int ans = 0;
    // Map<Integer, Integer> hm = new HashMap<>();

    // for(int c : nums3){
    //     for(int d : nums4)  hm.put(c+d, hm.getOrDefault(c+d, 0) + 1);
    // }


    // for(int i : nums1){
    //     for(int j : nums2){
    //         ans += hm.getOrDefault(-(i+j), 0);
    //     }
    // }
    // return ans;

        //   brute Force                  T.C --> O(n ^ 4)            S.C--> O(1)
        // int touples = 0;
        // for(int i : nums1){
        //     for(int j : nums2){
        //         for(int k : nums3){
        //             for(int l : nums4) if(i+j+k+l == 0) touples ++;
        //         }
        //     }
        // }
        // return touples;


        //optimize approach

        // int touples = 0;
        // Map<Integer, Integer> hm = new HashMap<>();
        // for(int i : nums4) hm.put(i, hm.getOrDefault(i, 0) + 1);

        // for(int i : nums1){
        //     for(int j : nums2){
        //         for(int k : nums3) touples += hm.getOrDefault(-(i+j+k), 0);
        //     }
        // }
        // return touples ;





        int touples = 0;
        Map<Integer, Integer> hm = new HashMap<>();

        for(int i : nums3)
            for(int j : nums4) hm.put(i+j, hm.getOrDefault(i+j, 0) + 1);

        for(int i : nums1){
            for(int j : nums2){
                touples += hm.getOrDefault(-(i+j), 0);
            }
        }
        return touples ;

    }
}











