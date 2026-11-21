package DYNAMIC_PROGRAMMING_02;

import java.util.Arrays;

public class q15_minimum_operations_to_make_mountains_array_1 {

    class Solution {
        public int minOperations(int[] nums) {
            int n = nums.length;
            if (n < 3) return -1;

            // 1. Dynamic upper bound (no hardcoded 2000)
            int maxVal = 0;
            for (int x : nums) maxVal = Math.max(maxVal, x);
            int maxH = maxVal + n;
            long INF = (long) 1e15;

            long[][] left = new long[n][maxH + 1];
            long[][] right = new long[n][maxH + 1];
            for (int i = 0; i < n; i++) {
                Arrays.fill(left[i], INF);
                Arrays.fill(right[i], INF);
            }

            // Base cases: ends can be any value >= 1
            for (int v = 1; v <= maxH; v++) {
                left[0][v] = Math.abs(nums[0] - v);
                right[n - 1][v] = Math.abs(nums[n - 1] - v);
            }

            // 2. Build Left DP (strictly increasing from 0 to n-1)
            for (int i = 1; i < n; i++) {
                long bestPrev = INF;
                for (int v = i + 1; v <= maxH; v++) {
                    bestPrev = Math.min(bestPrev, left[i - 1][v - 1]);
                    left[i][v] = bestPrev + Math.abs(nums[i] - v);
                }
            }

            // 3. Build Right DP (strictly decreasing from n-1 down to 0)
            for (int i = n - 2; i >= 0; i--) {
                long bestNext = INF;
                for (int v = n - i; v <= maxH; v++) {
                    bestNext = Math.min(bestNext, right[i + 1][v - 1]);
                    right[i][v] = bestNext + Math.abs(nums[i] - v);
                }
            }

            // 4. Combine at every valid peak p and peak height h
            long ans = INF;
            for (int p = 1; p <= n - 2; p++) {
                int minPeak = Math.max(p + 1, n - p);
                for (int h = minPeak; h <= maxH; h++) {
                    long total = left[p][h] + right[p][h] - Math.abs(nums[p] - h);
                    ans = Math.min(ans, total);
                }
            }

            return (int) ans;
        }
    }
}
