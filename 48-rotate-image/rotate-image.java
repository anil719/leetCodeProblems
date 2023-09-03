class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        //transpose
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j ++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
        for(int i = 0; i < n; i++){
            int left = 0, right = n-1;
            while(left <= right){
                int t = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = t;
                left ++;
                right--;
            }
        }
    }
}