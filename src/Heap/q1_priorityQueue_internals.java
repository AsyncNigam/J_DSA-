package Heap;

import java.util.PriorityQueue;

public class q1_priorityQueue_internals {
    static void main() {
//        in java minHeap is initialized by this priority queue
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(90);
        pq.add(25);
        pq.add(21);
        pq.add(26);
        pq.add(110);

        System.out.println(pq.peek()); //peek element in the heap
        System.out.println(pq.size()); // size of the heap
        System.out.println(pq.remove()); // to remove the heap top element it will return the element that it has removed
        System.out.println(pq); // to print the entire heap / priority queue at once

        for(int ele:pq)
            System.out.print(ele +" ");


    }
}