package Zeus_stroke.q2_bsearch;

public class q6_first_and_last_position_of_element_in_sorted_array {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            return new int[]{first(nums, target), last(nums,target)};
        }
        int first(int[] nums, int target){
            int s=0;
            int e=nums.length-1;
            while(s<=e){
                int mid=(s+e)/2;
                if(target>nums[mid])s=mid+1;
                else if(target<nums[mid])e=mid-1;
                else if(target==nums[mid] ){
                    if(mid>0 && nums[mid-1]==nums[mid]){
                        e=mid-1;
                        continue;
                    }
                    return mid;
                }
            }
            return -1;
        }
        int last(int[] nums, int target){
            int s=0;
            int e=nums.length-1;
            while(s<=e){
                int mid=(s+e)/2;
                if(target>nums[mid])s=mid+1;
                else if(target<nums[mid])e=mid-1;
                else if(target==nums[mid] ){
                    if(mid<nums.length-1 && nums[mid+1]==nums[mid]){
                        s=mid+1;
                        continue;
                    }
                    return mid;
                }
            }
            return -1;
        }
    }
}
