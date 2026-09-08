package Zeus_stroke.q6_heap;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class q2_smallest_number_in_infinite_set {
    class SmallestInfiniteSet {
        int currSmallest;
        PriorityQueue<Integer> minHeap;
        Set<Integer> addedBackSet;

        public SmallestInfiniteSet() {
            currSmallest=1;
            minHeap=new PriorityQueue<>();
            addedBackSet=new HashSet<>();
        }

        public int popSmallest() {
            if(!minHeap.isEmpty()){
                int smallest=minHeap.remove();
                addedBackSet.remove(smallest);
                return smallest;
            }
            return currSmallest++;
        }

        public void addBack(int num) {
            if(num<currSmallest && !addedBackSet.contains(num)){
                minHeap.add(num);
                addedBackSet.add(num);
            }
        }
    }

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
}
