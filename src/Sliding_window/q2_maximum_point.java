package Sliding_window;

public class q2_maximum_point {
    class Solution {
        public int maxScore(int[] cardPoints, int k) {
            int currentSum = 0;

            // 1. Calculate the sum of taking all 'k' cards from the left
            for (int i = 0; i < k; i++) {
                currentSum += cardPoints[i];
            }

            int maxSum = currentSum;
            int n = cardPoints.length;

            // 2. Slide the window: one by one, drop a card from the left
            // and pick one from the right
            for (int i = k - 1; i >= 0; i--) {
                currentSum = currentSum - cardPoints[i] + cardPoints[n - 1 - (k - 1 - i)];
                maxSum = Math.max(maxSum, currentSum);
            }

            return maxSum;
        }
    }
}
