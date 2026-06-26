package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class q3_n_queens {
    class Solution {
        public List<List<String>> solveNQueens(int n) {
            char[][] board=new char[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    board[i][j]='.';
                }
            }
            List<List<String>> ans=new ArrayList<>();
            nqueen(board,0,ans);
            return ans;
        }
        void nqueen(char[][] board,int row,List<List<String>> ans){
            int n=board.length;
            if(row==n){ //base case
                List<String> list=new ArrayList<>();
                for(int i=0;i<n;i++){
                    StringBuilder s= new StringBuilder();
                    for(int j=0;j<n;j++){
                        s.append(board[i][j]);
                    }
                    list.add(String.valueOf(s));
                }
                ans.add(list);
                return;
            }

//            orignal work
            for(int j=0;j<n;j++){
                if(isSafe(board,row,j)){
                    board[row][j]='Q';
                    nqueen(board,row+1,ans);
                    board[row][j]='.';
                }
            }
            return;
        }

        //        to check whether safe or not
        boolean isSafe(char[][] board, int row, int col){
            int n=board.length;
            // to check in row
            for(int j=0;j<n;j++){
                if(board[row][j]=='Q')return false;
            }
            // to check in column
            for(int i=0;i<n;i++){
                if(board[i][col]=='Q')return false;
            }
            // to check in north east
            int i=row;
            int j=col;
            while(i<n && j<n){
                if(board[i][j]=='Q')return false;
                i++;
                j++;
            }

            // to check in north west
            i=row;
            j=col;
            while(i<n && j>=0){
                if(board[i][j]=='Q')return false;
                i++;
                j--;
            }
            // to check in south east
            i=row;
            j=col;
            while(i>=0 && j<n){
                if(board[i][j]=='Q')return false;
                j++;
                i--;
            }

            // to check in south west
            i=row;
            j=col;
            while(i>=0 && j>=0){
                if(board[i][j]=='Q')return false;
                i--;
                j--;
            }


            return true;
        }
    }
}
