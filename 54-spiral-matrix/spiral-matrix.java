class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int n = matrix.length, m = matrix[0].length;
        int srow = 0, scol = 0, erow = n-1, ecol = m-1;
        int tne = n * m;
        int cnt = 0;

        while(cnt < tne){

              if(srow <= erow && scol <= ecol){
                for(int j = scol; j <= ecol; j++){
                    int val = matrix[srow][j];
                    ans.add(val);
                    cnt ++;
                }
                 srow ++;
             }
              if(srow <= erow && scol <= ecol){     
                for(int i = srow; i <= erow; i++){
                    int val = matrix[i][ecol];
                    ans.add(val);
                    cnt ++;
                }
                ecol--;
             }

            if(srow <= erow && scol <= ecol){
                for(int j= ecol ; j >= scol; j--){
                    int val =matrix[erow][j];
                    ans.add(val);
                    cnt ++;
                }
                erow--;
            }
            if(srow <= erow && scol <= ecol){
                for(int i = erow; i >= srow; i--){
                    int val = matrix[i][scol];
                    ans.add(val);
                    cnt ++;
                }
                scol ++;
            }
        }
        return ans;
    }
}