class Solution {
    public int findMin(int[] arr) {
        int n = arr.length;
        int i = 0, j = n-1;
        while(i <= j){
            int m = (i+j)/2;
            if(arr[m] < arr[j]) j = m;
            else i = m+1; 
        }
        return  arr[j];
    }
}