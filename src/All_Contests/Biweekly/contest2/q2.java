package All_Contests.Biweekly.contest2;

//https://leetcode.com/contest/biweekly-contest-193/problems/longest-resilient-subarray-i/
public class q2 {
    class Solution {
        public int resilientSubarray(int[] nums, int k) {
            int length=0;
            int n=nums.length;
            for(int i=0;i<n;i++){
                int rem=Math.floorMod(nums[i],k);
                for(int j=i; j<n; j++){
                    if(Math.floorMod(nums[j],k)!=rem)break;
                    if ((long)(j - i) * rem % k == 0) {
                        length = Math.max(length, j - i + 1);
                    }
                }
            }
            return length;
        }
    }
}
