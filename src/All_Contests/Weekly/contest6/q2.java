package All_Contests.Weekly.contest6;

import java.util.Arrays;
//https://leetcode.com/problems/maximize-sum-after-at-most-k-digit-rearrangements/
public class q2 {
    class Solution {
        public long maximizeSum(int[] nums, int k) {
            int n=nums.length;
            long[] gains=new long[n];
            long sum=0;

            for(int i=0;i<n;i++){
                sum+=nums[i];
                long maxDigit=getMax(nums[i]);
                gains[i]=maxDigit-nums[i];
            }

            Arrays.sort(gains);

            for(int i=n-1;i>=Math.max(0,n-k);i--){
                if(gains[i]>0) sum+=gains[i];
            }
            return sum;

        }
        long getMax(int n){
            char[] chars=String.valueOf(n).toCharArray();
            Arrays.sort(chars);
            StringBuilder sb=new StringBuilder(new String(chars));
            sb.reverse();
            return Long.parseLong(sb.toString());
        }

    }
}
