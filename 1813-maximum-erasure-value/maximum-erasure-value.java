class Solution {
    public int maximumUniqueSubarray(int[] arr) {
        int n = arr.length;

        int maxErasureVal = 0;
        int start = 0, end = 0;
        int runningSum = 0;
        Set<Integer> set = new HashSet<>();
        while(end < n){
            int cv = arr[end];
            if(!set.contains(cv)){
                set.add(cv);
                end ++;
                runningSum += cv;
                maxErasureVal = Math.max(maxErasureVal, runningSum);
            }
            else{
                int val = arr[start] ;
                start ++;
                 runningSum -= val;
                 set.remove(val);
            }
        }
        return maxErasureVal;

    }
}