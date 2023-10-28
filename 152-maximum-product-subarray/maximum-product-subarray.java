class Solution {
    public int maxProduct(int[] arr) {
       /*
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
        
        */

        /*       T.C --> O(n^3)     S.C --> O(1)

        int n = arr.length;
        int maxProduct = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int product = 1;
                for(int k = i; k <= j; k++) product *= arr[k];
                maxProduct = Math.max(maxProduct, product);
            }
        }
        return maxProduct;

        */

        int n = arr.length;
        int maxProduct = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            int product = 1;
            for(int j = i; j < n; j++){
                product *= arr[j];
                maxProduct = Math.max(maxProduct, product);
            }
        }
        return maxProduct;



    }
}