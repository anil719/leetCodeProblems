class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        fn(candidates, 0, target,  new ArrayList<>(), answer);
        return answer;
    }
    public void fn(int[] arr, int idx, int x, List<Integer> curr, List<List<Integer>> res){
        if(x < 0) return;

        if(x == 0){
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i = idx; i < arr.length; i++){
            curr.add(arr[i]);
            fn(arr, i, x-arr[i], curr, res);
            curr.remove(curr.size()-1);
        }
    }
}