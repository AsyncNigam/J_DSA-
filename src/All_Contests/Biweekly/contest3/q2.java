package All_Contests.Biweekly.contest3;
//https://leetcode.com/problems/count-subarrays-with-loose-bounds/
public class q2 {
    class Solution {
        public long countSubarrays(int[] nums, int minK, int maxK) {
            int n=nums.length;
            long count=0;
            long length=0;
            for(int i=0;i<n;i++){
                if(nums[i]>=minK && nums[i]<=maxK){
                    length++;
                    count+=length;
                }
                else length=0;
            }
            return count;
        }
    }
}
