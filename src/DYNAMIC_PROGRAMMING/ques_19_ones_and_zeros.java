package DYNAMIC_PROGRAMMING;

import java.util.Arrays;

public class ques_19_ones_and_zeros {
    class Solution {
        public int findMaxForm(String[] strs, int m, int n) {
            int[][][] dp=new int[strs.length][m+1][n+1];
            for(int i=0;i<strs.length;i++){
                for(int j=0;j<=m;j++){
                    Arrays.fill(dp[i][j], -1);
                }
            }
            return helper(0, strs, m, n, dp);
        }
        int helper(int i, String[] strs,int m,int n, int[][][] dp){
            if(i==strs.length)return 0;
            if(dp[i][m][n]!=-1)return dp[i][m][n];
            int[] zo=nuZeroOne(strs[i]);
            int skip=helper(i+1, strs, m, n, dp);

            if(zo[1]>m || zo[0]>n)return dp[i][m][n]=skip;
//            Why if (zo[1] > m || zo[0] > n) already handles single-character strings
//            You worried about strings containing only '0's (e.g., "0") or only '1's (e.g., "1"), and your check actually handles them properly:
//            Suppose m = 1, n = 0 and the current string is "0" (zo[0] = 0 ones, zo[1] = 1 zero).
//            zo[1] > m (1 > 1) is false, and zo[0] > n (0 > 0) is false.
//            So it will not skip "0"—it proceeds to take, leaving m = 0, n = 0.
//            It only skips when either the zeros needed exceed m or the ones needed exceed n, which is the exact condition for a string being invalid.
            int take=1+helper(i+1,strs, m-zo[1], n-zo[0], dp);
            return dp[i][m][n]=Math.max(skip, take);
        }
        int[] nuZeroOne(String str){
            int one=0;
            for(char ch: str.toCharArray()){
                if(ch=='1')one++;
            }
            return new int[]{one, str.length()-one};
        }
    }
}
