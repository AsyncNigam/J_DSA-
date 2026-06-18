package Heap2;

import java.util.Collections;
import java.util.PriorityQueue;

public class q4_find_median_in_data_stream {
//normal approach it will give tle

//    time O(n^2 logn)

//    class MedianFinder {
//    ArrayList<Integer> arr;
//    public MedianFinder() {
//        arr=new ArrayList<>();
//    }
//
//    public void addNum(int num) {
//        arr.add(num);
//    }
//
//    public double findMedian() {
//        Collections.sort(arr);
//        int n=arr.size();
//        if(n%2==1)return arr.get(n/2);
//        else return (arr.get(n/2)+arr.get(n/2-1))/2.0;
//
//    }
//}

//    by min and maxHeap
class MedianFinder {
    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;

    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void addNum(int num) {
        if (maxHeap.size() == 0)maxHeap.add(num);
        else {
            if(num < maxHeap.peek())
                maxHeap.add(num);
            else minHeap.add(num);
        }
        if (maxHeap.size() == minHeap.size() + 2)
            minHeap.add(maxHeap.remove());
        if (minHeap.size() == maxHeap.size() + 2)
            maxHeap.add(minHeap.remove());
    }

    public double findMedian() {
        if (maxHeap.size() == minHeap.size() + 1)
            return maxHeap.peek();
        else if (minHeap.size() == maxHeap.size() + 1)
            return minHeap.peek();
        else
            return (minHeap.peek() + maxHeap.peek()) / 2.0;
    }
}
}
