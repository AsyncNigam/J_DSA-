package Zeus_stroke.q1_arrays;

public class q5_search_insert_position {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int s=0;
            int e=nums.length-1;
            while(s<=e){
                int m=s+(e-s)/2;
                if(nums[m]>target)e=m-1;
                else if(nums[m]<target)s=m+1;
                else return m;
            }
            return s;
        }
    }
}
