package All_Contests.Weekly.contest7;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
//https://leetcode.com/contest/weekly-contest-527/problems/count-valid-suffix-sorts-ii/
public class q4 {


    class Solution {
        public int[] countSuffix(int[] nums, int[] target) {
            int n = nums.length;
            int m = target.length;
            int numWindows = m - n + 1;
            int[] ans = new int[numWindows];

            // 1. Multiset matching via 64-bit randomized hashing
            Map<Integer, Long> valToHash = new HashMap<>();
            Random rng = new Random(1337777);

            long numsHash = 0;
            for (int v : nums) {
                valToHash.putIfAbsent(v, rng.nextLong());
                numsHash += valToHash.get(v);
            }

            long[] targetPrefHash = new long[m + 1];
            for (int i = 0; i < m; i++) {
                valToHash.putIfAbsent(target[i], rng.nextLong());
                targetPrefHash[i + 1] = targetPrefHash[i] + valToHash.get(target[i]);
            }

            // 2. Precompute length of non-increasing contiguous subarray ending at each index in target
            int[] runEnd = new int[m];
            runEnd[0] = 1;
            for (int j = 1; j < m; j++) {
                if (target[j - 1] >= target[j]) {
                    runEnd[j] = runEnd[j - 1] + 1;
                } else {
                    runEnd[j] = 1;
                }
            }

            // 3. Find firstDiff(k) using Z-Algorithm: LCP between nums and target[k..k+n-1]
            // Concatenating nums + [-1] + target
            int combinedLen = n + 1 + m;
            int[] combined = new int[combinedLen];
            System.arraycopy(nums, 0, combined, 0, n);
            combined[n] = -1; // Sentinel value since 1 <= nums[i], target[i] <= 10^5
            System.arraycopy(target, 0, combined, n + 1, m);

            int[] z = computeZ(combined);

            // 4. Calculate valid suffix cuts for each window
            for (int k = 0; k < numWindows; k++) {
                // Check if window target[k..k+n-1] is an anagram of nums
                long windowHash = targetPrefHash[k + n] - targetPrefHash[k];
                if (windowHash != numsHash) {
                    ans[k] = 0;
                    continue;
                }

                // firstDiff is the first index where nums and target[k..k+n-1] differ
                int lcp = z[n + 1 + k];
                int firstDiff = Math.min(n - 1, lcp);

                // Longest non-increasing suffix in this window ends at (k + n - 1)
                int decLength = Math.min(n, runEnd[k + n - 1]);
                int validTargetStart = n - decLength;

                if (validTargetStart <= firstDiff) {
                    ans[k] = firstDiff - validTargetStart + 1;
                } else {
                    ans[k] = 0;
                }
            }

            return ans;
        }

        private int[] computeZ(int[] arr) {
            int len = arr.length;
            int[] z = new int[len];
            int l = 0, r = 0;
            for (int i = 1; i < len; i++) {
                if (i <= r) {
                    z[i] = Math.min(r - i + 1, z[i - l]);
                }
                while (i + z[i] < len && arr[z[i]] == arr[i + z[i]]) {
                    z[i]++;
                }
                if (i + z[i] - 1 > r) {
                    l = i;
                    r = i + z[i] - 1;
                }
            }
            return z;
        }
    }
}
