package Graphs.q4_dikjstra;

import java.util.Arrays;
import java.util.PriorityQueue;
//https://leetcode.com/problems/path-with-minimum-effort/
public class q3_path_with_minimum_effort {
    class Solution {
        class Triplet implements Comparable<Triplet>{
            int row;
            int col;
            int effort;
            Triplet(int row, int col, int effort){
                this.row=row;
                this.col=col;
                this.effort=effort;
            }
            public int compareTo(Triplet t){
                return Integer.compare(this.effort, t.effort);
            }
        }
        public int minimumEffortPath(int[][] height) {
            PriorityQueue<Triplet> pq=new PriorityQueue<>();
            int n=height.length;
            int m=height[0].length;
            int[][] efforts=new int[n][m];
            for(int i=0;i<n;i++) Arrays.fill(efforts[i],Integer.MAX_VALUE);
            efforts[0][0]=0;
            pq.add(new Triplet(0,0,0));
            while(pq.size()>0){
                Triplet front=pq.remove();
                int row=front.row;
                int col=front.col;
                int effort=front.effort;

                if(row==n-1 && col==m-1) return efforts[row][col];

                // UP
                if(row-1>=0) {
                    int newEffort = Math.max(effort, Math.abs(height[row][col]-height[row-1][col]));
                    if(efforts[row-1][col] > newEffort) {
                        efforts[row-1][col] = newEffort;
                        pq.add(new Triplet(row-1, col, newEffort));
                    }
                }
                // DOWN
                if(row+1<n) {
                    int newEffort = Math.max(effort, Math.abs(height[row][col]-height[row+1][col]));
                    if(efforts[row+1][col] > newEffort) {
                        efforts[row+1][col] = newEffort;
                        pq.add(new Triplet(row+1, col, newEffort));
                    }
                }
                // LEFT
                if(col-1>=0) {
                    int newEffort = Math.max(effort, Math.abs(height[row][col]-height[row][col-1]));
                    if(efforts[row][col-1] > newEffort) {
                        efforts[row][col-1] = newEffort;
                        pq.add(new Triplet(row, col-1, newEffort));
                    }
                }
                // RIGHT
                if(col+1<m) {
                    int newEffort = Math.max(effort, Math.abs(height[row][col]-height[row][col+1]));
                    if(efforts[row][col+1] > newEffort) {
                        efforts[row][col+1] = newEffort;
                        pq.add(new Triplet(row, col+1, newEffort));
                    }
                }
            }
            return 0;
        }
    }
}
