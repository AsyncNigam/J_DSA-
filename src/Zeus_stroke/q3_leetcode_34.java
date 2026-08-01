package Zeus_stroke;

public class q3_leetcode_34 {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int s = 0;
            int e = nums.length-1;
            int startIdx = -1;
            int endIdx = -1;

            // FOR starting point
            while (s <= e) {
                int m = s + (e - s) / 2;
                if (nums[m] < target)
                    s = m + 1;
                else if (nums[m] > target)
                    e = m - 1;
                else {
                    startIdx = m;
                    e = m - 1;

                }

            }


            // for ending
            s = 0;
            e = nums.length-1;
            while (s <= e) {
                int m = s + (e - s) / 2;
                if (nums[m] < target)
                    s = m + 1;
                else if (nums[m] > target)
                    e = m - 1;
                else {
                    endIdx = m;
                    s = m + 1;

                }

            }
            return new int[] { startIdx, endIdx };
        }
    }
}
