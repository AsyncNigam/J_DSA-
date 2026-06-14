package Heap;

import java.util.PriorityQueue;

public class q4_nearly_sorted_array {
//https://www.geeksforgeeks.org/problems/nearly-sorted-1587115620/1
    class Solution {
        public void nearlySorted(int[] arr, int k) {
            // code here
            PriorityQueue<Integer> pq=new PriorityQueue<>();
            int idx=0;
            for(int ele: arr){
                pq.add(ele);
                if(pq.size()>k)arr[idx++]=pq.remove();
            }
            while(pq.size()>0)arr[idx++]=pq.remove();

        }
    }

}
