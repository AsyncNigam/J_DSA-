package Heap;
//https://www.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1
import java.util.PriorityQueue;

public class q6_minimum_cost_of_ropes_gfg {
    class Solution {
        public static int minCost(int[] arr) {
            PriorityQueue<Integer> pq=new PriorityQueue<>();
            for(int el:arr)pq.add(el);

            int cost=0;
            while(pq.size()>=2){
                int x=pq.remove();
                int y=pq.remove();

                cost+=x+y;
                pq.add(x+y);
            }
            return cost;
        }
    }
}
