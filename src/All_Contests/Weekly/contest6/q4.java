package All_Contests.Weekly.contest6;
//https://leetcode.com/problems/count-frequency-staircase-subarrays-ii/
public class q4 {
    class Solution {
        public int countStaircase(int[] nums) {
            int n=nums.length;
            int[] freq=new int[100005];
            int[] order=new int[100005];
            int count=0;
            for(int i=0;i<n;i++){
                int k=0;
                int validCount=0;
                int j=i;
                while(j<n){
                    int val=nums[j];
                    if(order[val]==0){
                        k++;
                        order[val]=k;
                        if ((long) k * (k + 1) / 2 > n - i) {
                            break;
                        }
                    }
                    freq[val]++;
                    if(freq[val]>order[val])break;
                    if(freq[val]==order[val])validCount++;
                    if(validCount==k)count++;
                    j++;
                }
                int cleanupEnd = Math.min(n - 1, j);
                for(int p=i;p<=cleanupEnd;p++){
                    int val=nums[p];
                    freq[val]=0;
                    order[val]=0;
                }
            }
            return count;
        }
    }
}
