package Zeus_stroke.q1_arrays;

public class q11_leetcode_2091 {
    class Solution {
        public int minimumDeletions(int[] nums) {
            int n = nums.length;
            if (n <= 2) return n;

            int minIdx = 0;
            int maxIdx = 0;

            // Single pass to minimize O(N) overhead
            for (int k = 1; k < n; k++) {
                if (nums[k] < nums[minIdx]) minIdx = k;
                if (nums[k] > nums[maxIdx]) maxIdx = k;
            }

            // Standardize relative positions
            int i = Math.min(minIdx, maxIdx);
            int j = Math.max(minIdx, maxIdx);

            int deleteFront = j + 1;
            int deleteBack = n - i;
            int deleteBothSides = (i + 1) + (n - j);

            return Math.min(deleteFront, Math.min(deleteBack, deleteBothSides));
        }
    }
}
