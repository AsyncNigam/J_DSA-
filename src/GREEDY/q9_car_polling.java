package GREEDY;

import java.util.Arrays;
import java.util.PriorityQueue;

public class q9_car_polling {
    class Solution {
        public boolean carPooling(int[][] trips, int capacity) {
            // Sort trips by pickup location
            Arrays.sort(trips, (a, b) -> Integer.compare(a[1], b[1]));

            // Min-Heap stores {passengers, drop_off_location}
            // Sorted by drop-off location (earliest drop-off first)
            PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));

            int currentPassengers = 0;

            for (int[] trip : trips) {
                int numPassengers = trip[0];
                int from = trip[1];
                int to = trip[2];

                // Drop off passengers whose trip ended before or at the current pickup location
                while (!minHeap.isEmpty() && minHeap.peek()[1] <= from) {
                    currentPassengers -= minHeap.poll()[0];
                }

                // Pick up current passengers
                currentPassengers += numPassengers;

                // Worst-case failure mode: car overflows
                if (currentPassengers > capacity) {
                    return false;
                }

                // Add current trip to the active heap
                minHeap.offer(new int[]{numPassengers, to});
            }

            return true;
        }
    }
}
