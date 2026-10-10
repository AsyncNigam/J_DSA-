package All_Contests.Biweekly.contest2;

//https://leetcode.com/contest/biweekly-contest-193/problems/longest-resilient-subarray-ii/
public class q3 {
    class Solution {
        int gcd(int a, int b){
            while (b != 0) {
                int temp = a % b;
                a = b;
                b = temp;
            }
            return a;
        }
        public int resilientSubarray(int[] nums, int k) {
            int n=nums.length;
            int length=0;
            int i=0;
            while(i<n){
                int j=i;
                int rem=nums[i]%k;

                while (j < n && nums[j] % k == rem) {
                    j++;
                }
                int count = j - i;
                int step = k / gcd(rem, k);

                int max=((count-1)/step)*step+1;
                length=Math.max(max, length);
                i=j;
            }
            return length;
        }

    }
}
