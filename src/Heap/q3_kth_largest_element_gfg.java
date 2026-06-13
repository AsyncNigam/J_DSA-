package Heap;

import java.util.PriorityQueue;

public class q3_kth_largest_element_gfg {
    class Solution {
        // Function to return kth largest element from an array.
        public static int KthLargest(int arr[], int k) {
            // minheap
            PriorityQueue<Integer> pq=new PriorityQueue<>();
            for(int ele: arr){
                pq.add(ele);
                if(pq.size()>k)pq.remove();
            }
            return pq.peek();
        }
    }
}
