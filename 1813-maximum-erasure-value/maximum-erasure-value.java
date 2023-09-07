class Solution {
    public int maximumUniqueSubarray(int[] arr) {
        int n = arr.length;

        int start = 0, end = 0;
        int answer = 0;
        int runningSum = 0;
        Set<Integer> set = new HashSet<>();
        while(end < n){

            int curr = arr[end];
            if(!set.contains(curr)){
                runningSum += curr;
                set.add(curr);
                answer = Math.max(answer, runningSum);
                end ++;
            }
            else {
                int currSt = arr[start];
                set.remove(currSt);
                runningSum -= currSt ;
                start ++;
            }
        }
        return answer;
    }
}