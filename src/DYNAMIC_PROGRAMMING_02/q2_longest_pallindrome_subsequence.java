package DYNAMIC_PROGRAMMING_02;

import java.util.Arrays;

public class q2_longest_pallindrome_subsequence {
    class Solution {
        public int longestPalindromeSubseq(String s) {
            StringBuilder s2 = new StringBuilder(s).reverse(); // Create a separate reversed string, do not try to make reverse of a strngbuilder to stringbuilder
            int m=s.length();
            int[][] dp=new int[m][m];
            for(int i=0;i<m;i++){
                Arrays.fill(dp[i],-1);
            }
            return lcs(m-1,m-1,new StringBuilder(s),s2,dp);
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
