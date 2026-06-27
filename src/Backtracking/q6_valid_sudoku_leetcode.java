package Backtracking;

public class q6_valid_sudoku_leetcode {
    class Solution {
        public boolean isValidSudoku(char[][] board) {
            int n=board.length; // here given that 9x9 but we take n
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(board[i][j]=='.')continue;
                    char num=board[i][j];
                    board[i][j]='.';
                    if(!isValid(board,i,j,num))return false;
                    board[i][j]=num;
                }
            }
            return true;
        }
        boolean isValid(char[][] board,int row, int col, char num){
            int n=board.length;
            //check row
            for(int j=0;j<n;j++){
                if(board[row][j]==num)return false;
            }

            // check col
            for(int i=0;i<n;i++){
                if(board[i][col]==num)return false;
            }

            // chek in 3x3 grid
            int sRow=row/3 *3;
            int sCol=col/3 *3;
            for(int i=sRow;i<sRow+3;i++){
                for(int j=sCol;j<sCol+3;j++){
                    if(board[i][j]==num)return false;
                }
            }
            return true;

        }
    }
}
