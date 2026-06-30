class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                char digit = board[i][j];
                board[i][j] = '.';
                if(!(isSafe(board, i, j, digit))){
                    return false;
                }
                board[i][j] = digit;
            }
        }
        return true;
    }

    public boolean isSafe(char[][] board, int row, int col, char digit){
        for(int i=0; i<9; i++){
            if(board[row][i] == digit){
                return false;
            }
        }

        for(int i=0; i<9; i++){
            if(board[i][col] == digit){
                return false;
            }
        }

        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(board[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }
}