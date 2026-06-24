class Solution {
    public void solveSudoku(char[][] board) {
        sudokoSolver(board, 0, 0);
    }

    public static boolean sudokoSolver(char[][] board, int row, int col){
        if(row == 9){
            return true;
        }
        int nextRow = row , nextCol = col + 1;
        if(col + 1 == 9){
            nextRow = row + 1;
            nextCol = 0;
        }
        if(board[row][col] != '.'){
            return sudokoSolver(board, nextRow, nextCol);
        }

        for(char digit = '1'; digit <= '9'; digit++){
            if(isSafe(board, row, col, digit)){
                board[row][col] = digit;
                if(sudokoSolver(board, nextRow, nextCol)){
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }

    public static boolean isSafe(char[][] board, int row, int col, char digit){
        for(int i=0; i<board.length; i++){
            if(board[i][col] == digit){
                return false;
            }
        }

        for(int i=0; i<board.length; i++){
            if(board[row][i] == digit){
                return false;
            }
        }

        int sr = (row/3) * 3;
        int sc = (col/3) * 3;
        
        for(int i=sr; i< sr+3; i++){
            for(int j=sc; j< sc+3; j++){
                if(board[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }
}