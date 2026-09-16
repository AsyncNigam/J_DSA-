package A_Practice.A_Practicing_revision;

import java.util.Arrays;

public class leetcode_1508_range_sum_sorted_subarray_sums {
    class Solution {
        public int rangeSum(int[] nums, int n, int left, int right) {

            int r=n*(n+1)/2;
            int[] arr=new int[r];

            int idx=0;
            for(int i=0;i<n;i++){
                int sum=0;
                for(int j=i;j<n;j++){
                    sum+=nums[j];
                    arr[idx++]=sum;

                }
            }
            Arrays.sort(arr);

            int mod = 1000000007;

            long s=0;
            for(int i=left-1;i<right;i++){
                s=(s+arr[i])%mod;
            }
            return (int)s;
        }
    }
}
