class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < n; i++){
            List<Integer> inner = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i) inner.add(1);
                else{
                    List<Integer> last = result.get(result.size()-1);
                    int lf = last.get(j-1), rt = last.get(j);
                    inner.add(lf+rt);
                }
            }
            result.add(inner);
        }
        return result;

    }
}