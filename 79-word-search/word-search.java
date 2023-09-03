class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(word.charAt(0) == board[i][j] && exists(board, i, j, word, 0)) return true;
            }
        }
        return false;
    }

    public boolean exists(char[][] board, int i, int j, String word, int pos){
        if(pos == word.length()) return true;
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(pos)) return false;

        char t = board[i][j];
        board[i][j] = '*';

        if(exists(board, i+1, j, word, pos+1)  || 
            exists(board, i-1, j, word, pos+1) ||
            exists(board, i, j+1, word, pos+1)||
            exists(board, i, j-1, word, pos+1))  return true;

        board[i][j] = t;

        return false;
    }
}