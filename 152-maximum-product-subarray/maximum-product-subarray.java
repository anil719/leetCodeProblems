class Solution {
    public int maxProduct(int[] arr) {
        int n = arr.length;
        //prefix Maxproduct

        int prd = 1;
        int MaxProduct = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            prd *= arr[i];
            MaxProduct = Math.max(MaxProduct, prd);
            if(prd == 0) prd = 1;
        }


        //sufffix Maxproduct
        prd = 1;
        for(int i = n-1; i >= 0; i--){
            prd *= arr[i];
            MaxProduct = Math.max(MaxProduct, prd);
            if(prd == 0) prd = 1;
        }

        return MaxProduct;
    }
}