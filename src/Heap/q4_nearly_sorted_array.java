package Heap;
//https://www.geeksforgeeks.org/problems/nearly-sorted-1587115620/1

import java.util.PriorityQueue;

public class q4_nearly_sorted_array {
    class Solution {
        public void nearlySorted(int[] arr, int k) {
            // minHeap

//            time complexity O(nlogk) , n for number of elements and logk for input and removal
//            space O(k)
            PriorityQueue<Integer> pq=new PriorityQueue<>();
            int idx=0;
            for(int ele: arr){
                pq.add(ele);
                if(pq.size()>k)arr[idx++]=pq.remove();
            }
//            to empty the priority queue , because k elements has been left
            while(pq.size()>0)arr[idx++]=pq.remove();

        }
    }

}
