package DYNAMIC_PROGRAMMING_02;

public class q8_edit_distance_tabulation {
    class Solution {
        public int minDistance(String w1, String w2) {
            int m=w1.length();
            int n=w2.length();
            if(m==0)return n;
            if(n==0)return m;
            int[][] dp=new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    int p=(i>=1 && j>=1) ? dp[i-1][j-1] : (i==0 ? j : i);
                    int q=(j>=1) ? dp[i][j-1] : i;
                    int r=(i>=1) ? dp[i-1][j] : j;
                    if(w1.charAt(i)==w2.charAt(j)) dp[i][j]=p;
                    else
                        dp[i][j]=1+Math.min(r,Math.min(p,q));
                }
            }
            return dp[m-1][n-1];
        }



    }
}
