package Zeus_stroke.q1_arrays;

import java.util.Arrays;

public class q13_minimum_swaps_to_sort_by_digit_sum {
    class Solution {
        public int minSwaps(int[] nums) {
            int n=nums.length;
            int[][] ans=new int[n][3];
            for(int i=0;i<n;i++){
                ans[i][0]=nums[i];
                ans[i][1]=sum(nums[i]);
                ans[i][2]=i;
            }
            Arrays.sort(ans, (a, b)->{
                if(a[1]==b[1])return Integer.compare(a[0],b[0]);
                return Integer.compare(a[1],b[1]);
            });

            int swaps=0;
            boolean[] visit=new boolean[n];
            for(int i=0;i<n;i++){
                if(visit[i] || ans[i][2]==i)continue;
                int cycleSize=0;
                int j=i;
                while(!visit[j]){
                    visit[j]=true;
                    j=ans[j][2];
                    cycleSize++;
                }
                if(cycleSize>0)swaps+=cycleSize-1;
            }
            return swaps;
        }
        int sum(int ele){
            int s=0;
            while(ele>0){
                s+=ele%10;
                ele/=10;
            }
            return s;
        }
    }
}
