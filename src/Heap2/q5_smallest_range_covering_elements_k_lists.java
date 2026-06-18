package Heap2;

import java.util.List;
import java.util.PriorityQueue;

public class q5_smallest_range_covering_elements_k_lists {
    class Solution {
        // Represents an element in the min-heap, tracking exactly where it came from.
        class Element implements Comparable<Element> {
            int value;
            int listIndex;
            int elementIndex;

            Element(int value, int listIndex, int elementIndex) {
                this.value = value;
                this.listIndex = listIndex;
                this.elementIndex = elementIndex;
            }

            // Ascending order for the Min-Heap
            public int compareTo(Element other) {
                return this.value - other.value;
            }
        }

        public int[] smallestRange(List<List<Integer>> nums) {
            PriorityQueue<Element> minHeap = new PriorityQueue<>();
            int currentMax = Integer.MIN_VALUE;

            // Phase 1: Initialization
            // Populate the heap with the 0th element of every list.
            // A valid range MUST contain at least one element from every list.
            for (int i = 0; i < nums.size(); i++) {
                int firstValue = nums.get(i).get(0);
                minHeap.add(new Element(firstValue, i, 0));
                currentMax = Math.max(currentMax, firstValue);
            }

            int bestRangeStart = 0;
            int bestRangeEnd = Integer.MAX_VALUE;

            // Phase 2: Sliding Window via Heap
            while (!minHeap.isEmpty()) {
                // The heap guarantees we always pull the absolute minimum element currently in the window.
                Element minElement = minHeap.poll();
                int currentMin = minElement.value;

                // Evaluate if the current window [currentMin, currentMax] is the tightest we've seen.
                if (currentMax - currentMin < bestRangeEnd - bestRangeStart) {
                    bestRangeStart = currentMin;
                    bestRangeEnd = currentMax;
                }

                // Termination Condition:
                // If the list we just pulled from has no more elements, we can't replace it.
                // Moving forward would break the rule of having at least one element from EVERY list.
                if (minElement.elementIndex == nums.get(minElement.listIndex).size() - 1) {
                    break;
                }

                // Shift the window forward:
                // Grab the next element from the exact same list that just lost its minimum element.
                int nextValue = nums.get(minElement.listIndex).get(minElement.elementIndex + 1);

                // Push the new element into the heap and update the global maximum if necessary.
                minHeap.add(new Element(nextValue, minElement.listIndex, minElement.elementIndex + 1));
                currentMax = Math.max(currentMax, nextValue);
            }

            return new int[]{bestRangeStart, bestRangeEnd};
        }
    }
}
