package Backtracking;


public class q4_nqueens_2_leetcode {
    class Solution {
        public int totalNQueens(int n) {
            char[][] board = new char[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    board[i][j] = '.';
                }
            }

            return nqueen(board, 0);
        }

        int nqueen(char[][] board, int row) {
            int n = board.length;
            if (row == n) { //base case if reach return  1
                return 1;
            }
            //  orignal work
            int totalSolutions = 0;
            for (int j = 0; j < n; j++) {
                if (isSafe(board, row, j)) {
                    board[row][j] = 'Q';
                    int x = nqueen(board, row + 1);
                    board[row][j] = '.';
                    totalSolutions += x;
                }
            }
            return totalSolutions;
        }

        //        to check whether safe or not same as n queen 1
        boolean isSafe(char[][] board, int row, int col) {
            int n = board.length;
            // to check in row
            for (int j = 0; j < n; j++) {
                if (board[row][j] == 'Q')
                    return false;
            }
            // to check in column
            for (int i = 0; i < n; i++) {
                if (board[i][col] == 'Q')
                    return false;
            }
            // to check in north east
            int i = row;
            int j = col;
            while (i < n && j < n) {
                if (board[i][j] == 'Q')
                    return false;
                i++;
                j++;
            }

            // to check in north west
            i = row;
            j = col;
            while (i < n && j >= 0) {
                if (board[i][j] == 'Q')
                    return false;
                i++;
                j--;
            }
            // to check in south east
            i = row;
            j = col;
            while (i >= 0 && j < n) {
                if (board[i][j] == 'Q')
                    return false;
                j++;
                i--;
            }

            // to check in south west
            i = row;
            j = col;
            while (i >= 0 && j >= 0) {
                if (board[i][j] == 'Q')
                    return false;
                i--;
                j--;
            }

            return true;
        }
    }


}
