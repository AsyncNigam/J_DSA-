package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class q7_k_closest_points_to_origin {
    class Solution {
        class Triplet implements Comparable<Triplet>{ // for custom comparator
            int dist;
            int x;
            int y;

            Triplet(int dist, int x, int y){
                this.dist=dist;
                this.x=x;
                this.y=y;
            }

            public int compareTo(Triplet t){
                return this.dist-t.dist;
            }
        }
        public int[][] kClosest(int[][] points, int k) {
//            as we are finding the closest element that's why max heap
            PriorityQueue<Triplet> pq=new PriorityQueue<>(Collections.reverseOrder());
            for(int[] point:points){
                int x=point[0];
                int y=point[1];

                int dist=x*x + y*y;

                pq.add(new Triplet(dist,x,y));
                if(pq.size()>k)pq.remove();
            }

            int[][] ans=new int[k][2];
            for(int i=0;i<k;i++){
                Triplet top=pq.remove();
                ans[i][0]=top.x;
                ans[i][1]=top.y;
            }
            return ans;
        }
    }

}
