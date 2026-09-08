package Zeus_stroke.q1_arrays;

public class q7_next_permutation {
    class Solution {
        public void nextPermutation(int[] nums) {
            int n = nums.length;
            int pivot = -1;

            // 1. Find the breakpoint
            for (int i = n - 2; i >= 0; i--) {
                if (nums[i] < nums[i + 1]) {
                    pivot = i;
                    break;
                }
            }

            // 2. If no breakpoint, it's the last permutation. Reverse and exit.
            if (pivot == -1) {
                reverse(0, n - 1, nums);
                return;
            }

            // 3. Find the next greater element index from the right
            int swapIndex = -1;
            for (int i = n - 1; i > pivot; i--) {
                if (nums[i] > nums[pivot]) {
                    swapIndex = i;
                    break;
                }
            }

            // 4. Swap and reverse the tail
            swap(swapIndex, pivot, nums);
            reverse(pivot + 1, n - 1, nums);
        }

        void reverse(int s, int e, int[] nums) {
            while (s < e) {
                swap(s, e, nums);
                s++;
                e--;
            }
        }

        void swap(int i, int j, int[] nums) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
