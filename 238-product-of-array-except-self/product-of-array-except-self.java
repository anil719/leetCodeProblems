class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int prdBeforeCurrent = 1, prdAfterCurrent = 1;
        int[] result = new int[n];
        for(int i = 0; i < n; i++){
            result[i] = prdBeforeCurrent;
            prdBeforeCurrent*= arr[i] ;
        }

        for(int i = n-1; i>= 0; i--){
            result[i] *= prdAfterCurrent;
            prdAfterCurrent *= arr[i];
        }

        return result;
    }
}