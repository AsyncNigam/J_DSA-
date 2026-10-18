package All_Contests.Weekly.contest5;

//https://leetcode.com/problems/minimum-deletions-to-make-array-sharp/description/
public class q1 {
    class Solution {
        public int minDeletions(int[] nums) {
            int n=nums.length;
            int count=0;
            for(int i=0;i<n-1;i++){
                if((nums[i] ^ nums[i+1])==0)count++;
            }
            return count;
        }
    }
}
