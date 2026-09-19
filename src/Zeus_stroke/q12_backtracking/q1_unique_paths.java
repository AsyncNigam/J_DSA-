package Zeus_stroke.q12_backtracking;

public class q1_unique_paths {
//    in this particular problem, you don't actually need visited.
//
//Why?
//
//Because you only move: right or down
//
//You can never return to an earlier cell.
//
//So there is no possibility of:(0,0) → (0,1) → (0,0)
//
//Therefore visited isn't preventing anything useful.
//
//that's why it will still give tle
    class Solution {
        public int uniquePaths(int m, int n) {
            boolean[][] visited=new boolean[m][n];
            return paths(0,0,m-1,n-1,visited);
        }
        int paths(int r, int c, int er, int ec, boolean[][] visited){
            if(r==er && c==ec){
                visited[r][c]=false;
                return 1;
            }
            if(r>er || c>ec)return 0;
            visited[r][c]=true;
            int right=paths(r+1,c,er,ec,visited);
            int left=paths(r,c+1,er,ec,visited);
            visited[r][c]=false;
            return right+left;
        }
    }
}
