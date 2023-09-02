class Solution {
    public List<List<Integer>> threeSum(int[] arr) {

        int n = arr.length;
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(arr);
        
        for(int i  = 0; i < n; i++){
            if(i == 0 || arr[i] != arr[i-1]){
                int l = i+1, r = n-1;
                while(l < r){
                    int tar = -arr[i] ;
                    int sum = arr[l] + arr[r];
                    if(sum == tar){
                        answer.add(Arrays.asList(arr[i], arr[l], arr[r]));
                        while(l < r && arr[l] == arr[l+1]) l++;
                        while(l< r && arr[r] == arr[r-1]) r--;
                        l++;
                        r--;
                    }
                    else if(sum < tar) l++;
                    else r--;
                }
            }
        }
        return answer;
    }
}