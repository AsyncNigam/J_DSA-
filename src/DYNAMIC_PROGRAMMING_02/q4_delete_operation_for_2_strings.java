package DYNAMIC_PROGRAMMING_02;

import java.util.Arrays;

public class q4_delete_operation_for_2_strings {
    class Solution {
        public int minDistance(String w1, String w2) {
            return w1.length()+w2.length()-2*longestCommonSubsequence(w1,w2);
        }
        public int longestCommonSubsequence(String a, String b) {
            int m=a.length();
            int n=b.length();
            StringBuilder a1=new StringBuilder(a);
            StringBuilder b1=new StringBuilder(b);

            int[][] dp=new int[m][n];
            for(int i=0;i<m;i++)
                Arrays.fill(dp[i],-1);
            return lcs(m-1,n-1,a1,b1,dp);
        }
        int lcs(int i,int j,StringBuilder a, StringBuilder b,int[][] dp) {

            if(i<0 || j<0)return 0;
            if(dp[i][j]!=-1)return dp[i][j];
            if(a.charAt(i)==b.charAt(j)){
                return dp[i][j]=1+lcs(i-1,j-1,a,b,dp);
            }
            else{
                return dp[i][j]=Math.max(lcs(i-1,j,a,b,dp),lcs(i,j-1,a,b,dp));
            }
        }
    }

}
