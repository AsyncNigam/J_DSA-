package DYNAMIC_PROGRAMMING_02;

//  given 2 strings we have to find out their shortest common super sequence length

//this is the gfg question
//https://www.geeksforgeeks.org/problems/shortest-common-supersequence0322/1
public class q11_shortest_common_supersequence_length {
    class Solution {
        public static int minSuperSeq(String a,String b){
            int m=a.length();
            int n=b.length();
            return m+n-lcs(a,b);

        }

        static int lcs(String a,String b){
            int m=a.length();
            int n=b.length();
            int[][] dp=new int[m+1][n+1];
            for(int i=1;i<=m;i++){
                for(int j=1;j<=n;j++){
                    if(a.charAt(i-1)==b.charAt(j-1)) dp[i][j]=1+dp[i-1][j-1];
                    else  dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
            return dp[m][n];
        }
    }
}
