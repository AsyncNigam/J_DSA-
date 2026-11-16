package Leetcode_75;

import java.util.Arrays;

public class q18_successfull_pairs_of_spells_and_potions {
    class Solution {
        public int[] successfulPairs(int[] spells, int[] portions, long success) {
            int n=spells.length;
            int m=portions.length;
            Arrays.sort(portions);
            int[] ans=new int[n];
            for(int i=0;i<n;i++){
                int s=0;
                int e=m-1;
                while(s<=e){
                    int mid=(s+e)/2;
                    if ((long) portions[mid] * spells[i] >= success)e=mid-1;
                    else s=mid+1;
                }
                ans[i]=m-s;
            }
            return ans;
        }
    }
}
