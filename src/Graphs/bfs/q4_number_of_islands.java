package Graphs.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class q4_number_of_islands {
    class Solution {
        public int numIslands(char[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            boolean[][] visit = new boolean[m][n];
            int count = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == '1' && !visit[i][j]) {
                        bfs(i, j, grid, visit);
                        count++;
                    }
                }
            }
            return count;
        }

        class Pair {
            int row;
            int col;

            Pair(int row, int col) {
                this.row = row;
                this.col = col;
            }
        }

        void bfs(int i, int j, char[][] grid, boolean[][] visit) {
            Queue<Pair> q = new LinkedList<>();
            int m = grid.length;
            int n = grid[0].length;
            q.add(new Pair(i, j));
            while (!q.isEmpty()) {
                Pair front = q.remove();
                int row = front.row;
                int col = front.col;
                // to check in left
                if (col > 0) {
                    if (visit[row][col - 1] == false && grid[row][col - 1] == '1') {
                        q.add(new Pair(row, col - 1));
                        visit[row][col - 1] = true;
                    }
                }

                // to check in top
                if (row > 0) {
                    if (visit[row - 1][col] == false && grid[row - 1][col] == '1') {
                        q.add(new Pair(row - 1, col));
                        visit[row - 1][col] = true;
                    }
                }

                // to check in right
                if (col < n - 1) {
                    if (visit[row][col + 1] == false && grid[row][col + 1] == '1') {
                        q.add(new Pair(row, col + 1));
                        visit[row][col + 1] = true;
                    }
                }

                // to check in bottom
                if ((row + 1) < m) {
                    if (visit[row + 1][col] == false && grid[row + 1][col] == '1') {
                        q.add(new Pair(row + 1, col));
                        visit[row + 1][col] = true;
                    }
                }
            }
        }
    }
}
