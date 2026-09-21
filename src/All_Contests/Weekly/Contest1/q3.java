package All_Contests.Weekly.Contest1;
//https://leetcode.com/problems/maximum-pulse-value-after-one-subarray-rotation/
public class q3 {
    class Solution {
        public long maxValue(int[] nums) {
            int n = nums.length;

            if (n == 1) {
                return nums[0];
            }

            long[] signArray = new long[n];
            long originalPulse = 0;

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    signArray[i] = nums[i];   // Even indices are positive
                } else {
                    signArray[i] = -nums[i];  // Odd indices are negative
                }
                originalPulse += signArray[i];
            }

            long minEvenSum = 0;

            long currentRunningTotal = 0;
            for (int i = 0; i < n - 1; i += 2) {
                long pairSum = signArray[i] + signArray[i + 1];

                currentRunningTotal = Math.min(pairSum, currentRunningTotal + pairSum);

                minEvenSum = Math.min(minEvenSum, currentRunningTotal);
            }

            currentRunningTotal = 0;
            for (int i = 1; i < n - 1; i += 2) {
                long pairSum = signArray[i] + signArray[i + 1];

                currentRunningTotal = Math.min(pairSum, currentRunningTotal + pairSum);
                minEvenSum = Math.min(minEvenSum, currentRunningTotal);
            }

            return originalPulse - (2 * minEvenSum);
        }
    }
}
