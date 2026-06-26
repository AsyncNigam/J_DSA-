package Backtracking;

//    basic approach of unique paths by recursion this will give tle
    class Solution1_2directions {
        public int uniquePaths(int m, int n) {
            if (m == 1 || n == 1)
                return 1;
            return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
        }
    }

//    by same recursive approach but with increasing trial
    class Solution2_2directions  {
        public int uniquePaths(int m, int n) {
            return paths(0, 0, m - 1, n - 1);
        }

        int paths(int r, int c, int er, int ec) {
            if (r == er && c == ec)
                return 1;
            if (r > er || c > ec)
                return 0;
            int right = paths(r, c + 1, er, ec);
            int down = paths(r + 1, c, er, ec);
            return right + down;
        }
    }


//    if 4 directions given and we solve that normally by just adding like of the above solution that will give us stack overflow error

class solution1{
    //            this solution will give stack overflow
    static void main() {
        System.out.println(uniquePaths(5,5));
    }
    public static int uniquePaths(int m, int n) {
        return paths(0, 0, m - 1, n - 1);
    }

    static int  paths(int r, int c, int er, int ec) {
        if (r == er && c == ec)
            return 1;
        if (r > er || c > ec || r<0 ||c<0)
            return 0;
        int right = paths(r, c + 1, er, ec);
        int down = paths(r + 1, c, er, ec);
        int left=paths(r-1,c,er,ec);
        int up=paths(r,c-1,er,ec);
        return right + down+left+up;

    }

}


//        so to solve stack overflow we will store that in an boolean array that viisted or not
class solution2{
    static void main() {
        System.out.println(uniquePaths(5,5));
    }
    public static int uniquePaths(int m, int n) {
        boolean[][] visited=new boolean[m][n];
        return paths(0, 0, m - 1, n - 1,visited);
    }

    static int  paths(int r, int c, int er, int ec, boolean[][] visited) {
        if (r == er && c == ec){
            return 1;
        }

        if (r > er || c > ec || r<0 ||c<0 || visited[r][c])
            return 0;
        visited[r][c]=true;

        int right = paths(r, c + 1, er, ec,visited);
        int down = paths(r + 1, c, er, ec,visited);
        int left=paths(r-1,c,er,ec,visited);
        int up=paths(r,c-1,er,ec,visited);
        return right + down+left+up;

    }

}

//but this approach will skip some paths  so we need backtracking


//        so to solve stack overflow we will store that in an boolean array that viisted or not
class solution3_perfect{
    static void main() {
        System.out.println(uniquePaths(3,3));
    }
    public static int uniquePaths(int m, int n) {
        boolean[][] visited=new boolean[m][n];
        return paths(0, 0, m - 1, n - 1,visited);
    }

    static int  paths(int r, int c, int er, int ec, boolean[][] visited) {
        if (r == er && c == ec){
            visited[r][c]=false; //backtracking
            return 1;
        }

        if (r > er || c > ec || r<0 ||c<0 || visited[r][c])
            return 0;
        visited[r][c]=true;

        int right = paths(r, c + 1, er, ec,visited);
        int down = paths(r + 1, c, er, ec,visited);
        int left=paths(r-1,c,er,ec,visited);
        int up=paths(r,c-1,er,ec,visited);
        visited[r][c]=false; // backtracking

        return right + down+left+up;
    }

}