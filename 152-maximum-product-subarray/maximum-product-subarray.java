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

        /*      T.C --> O(n^2)     S.C --> O(1)

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

        */

        // int n = arr.length;
        // int maxProduct = arr[0];
        // int currProduct = arr[0];

        // for(int i = 1; i < n; i++){
        //     currProduct = Math.max(currProduct*arr[i], arr[i]);
        //     maxProduct = Math.max(maxProduct, currProduct);
        // }
        // return maxProduct;


        int n = arr.length;
        int maxProduct = arr[0];
        int minProduct = arr[0];
        int result = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }
            
            maxProduct = Math.max(arr[i], maxProduct * arr[i]);
            minProduct = Math.min(arr[i], minProduct * arr[i]);
            
            result = Math.max(result, maxProduct);
        }

        return result;




    }
}