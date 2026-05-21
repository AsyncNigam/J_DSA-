package DYNAMIC_PROGRAMMING_02;

//https://www.geeksforgeeks.org/problems/longest-common-substring1452/1

public class q10_longest_common_substring {
//    here we are going to find out the longest common substring not subsequence, subsequence like should be in sequential manner not need that should be adjacent,
//    substring means should be in the string common

    class Solution {
        public int longCommSubstr(String a, String b) {
            int m=a.length();
            int n=b.length();
            int max=0; // we will store in a variable because what if we skip the string by storing 0 in the index so keeping the max and returning it
            int[][] dp=new int[m+1][n+1];
            for(int i=1;i<=m;i++){
                for(int j=1;j<=n;j++){
                    if(a.charAt(i-1)==b.charAt(j-1)) dp[i][j]=1+dp[i-1][j-1];
                    else  dp[i][j]=0;   // as we are taking the substring so we are not considering, if after something becomes not equal
                    max=Math.max(max,dp[i][j]);
                }
            }
            return max;

        }
    }
}
