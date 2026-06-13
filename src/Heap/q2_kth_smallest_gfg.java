package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class q2_kth_smallest_gfg {
    class Solution {
        public int kthSmallest(int[] arr, int k) {
            // Code here
            PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

            for(int ele: arr){
                pq.add(ele);
                if(pq.size()>k)pq.remove();
            }
            return pq.peek();
        }
    }

}
