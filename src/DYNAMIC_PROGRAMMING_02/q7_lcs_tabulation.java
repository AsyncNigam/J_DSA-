package DYNAMIC_PROGRAMMING_02;


public class q7_lcs_tabulation {
//    longest common subsequence with tabulation

//class Solution {
//    public int longestCommonSubsequence(String a, String b) {
//        int m=a.length();
//        int n=b.length();
//        int[][] dp=new int[m][n];
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
    // we are adding these because if i==0 or j==0 and we -1 from them that will give array out of bound
//                int p=(i>=1 && j>=1) ? dp[i-1][j-1] : 0;
//                int q=(i>=1) ? dp[i-1][j] : 0;
//                int r=(j>=1) ? dp[i][j-1] : 0;
//
//                if(a.charAt(i)==b.charAt(j)) dp[i][j]=1+p;
//                else  dp[i][j]=Math.max(q,r);
//            }
//        }
//        return dp[m-1][n-1];
//    }
//
//}


//    the array out of bound problem can be solved by maintaining an extra array
//class Solution {
//    public int longestCommonSubsequence(String a, String b) {
//        int m=a.length();
//        int n=b.length();
//        int[][] dp=new int[m+1][n+1];
//        for(int i=1;i<=m;i++){
//            for(int j=1;j<=n;j++){
//                if(a.charAt(i-1)==b.charAt(j-1)) dp[i][j]=1+dp[i-1][j-1];
//                else  dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
//            }
//        }
//        return dp[m][n];
//    }
//
//}

//    by space optimization
class Solution {
    public int longestCommonSubsequence(String a, String b) {
        int m=a.length();
        int n=b.length();
        int[][] dp=new int[2][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(a.charAt(i-1)==b.charAt(j-1)) dp[1][j]=1+dp[0][j-1];
                else  dp[1][j]=Math.max(dp[0][j],dp[1][j-1]);
            }
            // copy the 1st row to 0th
            for(int j=1;j<=n;j++){
                dp[0][j]=dp[1][j];
            }
        }
        return dp[1][n];
    }

}

}
