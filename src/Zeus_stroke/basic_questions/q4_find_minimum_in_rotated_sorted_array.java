package Zeus_stroke.basic_questions;

public class q4_find_minimum_in_rotated_sorted_array {
    class Solution {
        public int findMin(int[] nums) {
            int pivot=-1;
            int n=nums.length;
            for(int i=0;i<n-1;i++){
                if(nums[i]>nums[i+1]){pivot=i;break;}
            }
            if(pivot==-1)return nums[0];

            return nums[pivot+1];

        }
    }
}
