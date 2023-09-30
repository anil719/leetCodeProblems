class Solution {
    public int maxArea(int[] arr) {
       int n = arr.length;

       int answer = 0;
       int i = 0, j = n-1;
       while(i <= j){
           int currWater = (j-i)*(Math.min(arr[i], arr[j])) ;
           answer = Math.max(answer, currWater);
           if(arr[i] < arr[j]) i++;
           else j--;
       }
       return answer;
    }
}