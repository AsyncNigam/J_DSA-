package Backtracking;

import java.util.ArrayList;

public class q2_rat_in_a_maze_obtacles_gfg {


    class Solution {
        static ArrayList<String> arr;
        public static ArrayList<String> ratInMaze(int[][] maze) {
            int n=maze.length;
            boolean[][] visited=new boolean[n][n];
            arr=new ArrayList<String>();
            paths(0, 0, n - 1, n - 1,visited,maze,"");
            return arr;

        }
        static void paths(int r, int c, int er, int ec, boolean[][] visited, int[][] maze,String s) {
            if (r == er && c == ec){
                arr.add(s);
                visited[r][c] = false; //backtracking
                return ;
            }

            if (r > er || c > ec || r<0 ||c<0 || visited[r][c] || maze[r][c]==0)
                return ;
            visited[r][c]=true;


            paths(r + 1, c, er, ec,visited,maze,s+'D');

            paths(r,c-1,er,ec,visited, maze,s+'L');
            paths(r, c + 1, er, ec,visited, maze,s+'R');
            paths(r-1,c,er,ec,visited, maze,s+'U');

            visited[r][c]=false; // backtracking

            return ;
        }
    }

}
