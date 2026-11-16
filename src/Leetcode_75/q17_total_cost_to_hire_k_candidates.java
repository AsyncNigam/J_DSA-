package Leetcode_75;

import java.util.PriorityQueue;

public class q17_total_cost_to_hire_k_candidates {
    class Solution {
        public long totalCost(int[] costs, int k, int candidates) {
            int n=costs.length;
            int left=0;
            int right=costs.length-1;
            PriorityQueue<Integer> leftHeap=new PriorityQueue<>();
            PriorityQueue<Integer> rightHeap=new PriorityQueue<>();
            for(int i=0;i<candidates;i++){
                leftHeap.add(costs[left++]);
            }
            for(int i=0;i<candidates && left<=right; i++){
                rightHeap.offer(costs[right--]);
            }
            long totalCost=0;
            for(int i=0;i<k;i++){
                if (!rightHeap.isEmpty() && (leftHeap.isEmpty() || leftHeap.peek() > rightHeap.peek())) {
                    totalCost += rightHeap.poll();
                    if (left <= right) {
                        rightHeap.offer(costs[right--]);
                    }
                } else {
                    totalCost += leftHeap.poll();
                    if (left <= right) {
                        leftHeap.offer(costs[left++]);
                    }
                }
            }
            return totalCost;
        }
    }
}
