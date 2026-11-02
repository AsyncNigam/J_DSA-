package Sliding_window;

public class q2_maximum_point {
    class Solution {
        public int maxScore(int[] nums, int k) {
            int lsum=0;
            int rsum=0;
            int sum=0;
            int n=nums.length;
            for(int i=0;i<k;i++){
                lsum+=nums[i];
            }
            sum=lsum;
            int ridx=n-1;
            for(int i=k-1;i>=0;i--){
                lsum-=nums[i];
                rsum+=nums[ridx];
                ridx--;
                sum=Math.max(sum,lsum+rsum);
            }
            return sum;
        }
    }
}
