class Solution {
    public int search(int[] arr, int x) {
        int n = arr.length;
        int i = 0, j = n-1;

        while(i <= j){
            int m = (i+j)/2;
            if(arr[m] == x) return m;

            if(arr[i] <= arr[m]){
                if(x >= arr[i] && x < arr[m]) j = m-1;
                else i = m+1;
            }
            else if(arr[m] <= arr[j]){
                if(x > arr[m] && x <= arr[j]) i = m+1;
                else j = m-1;
            }
        }
        return -1;
    }
}