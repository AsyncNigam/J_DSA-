package DYNAMIC_PROGRAMMING_02;

import java.util.Arrays;

public class q1_longest_common_subsequence {
//    main recursive approach
//    class Solution {
//    public int longestCommonSubsequence(String a, String b) {
//
//        int m=a.length();
//        int n=b.length();
//
//        if(m==0 || n==0)return 0;
//
//        String a1=a.substring(0,m-1);
//        String b1=b.substring(0,n-1);
//
//        if(a.charAt(m-1)==b.charAt(n-1)){
//            return 1+longestCommonSubsequence(a1,b1);
//        }
//        else{
//            return Math.max(longestCommonSubsequence(a,b1),longestCommonSubsequence(a1,b));
//        }
//
//    }
//}


//    more space optimized approach not creating substring and string everytime

// class Solution {
//    public int longestCommonSubsequence(String a, String b) {
//        int m=a.length();
//        int n=b.length();
//        return lcs(m-1,n-1,a,b);
//    }
//      int lcs(int i,int j,String a, String b) {
//
//        if(i<0 || j<0)return 0;    //here directly checking i and j , unlike in previous m,n we were checking m-1,n-1 so we're considering i=0 and j=0
//        if(a.charAt(i)==b.charAt(j)){
//            return 1+lcs(i-1,j-1,a,b);
//        }
//        else{
//            return Math.max(lcs(i-1,j,a,b),lcs(i,j-1,a,b));
//        }
//    }
//}

//    above approach can be optimized more , because strings are pass by value , we can use stringBUilders which are pass by reference

//    class Solution {
//        public int longestCommonSubsequence(String a, String b) {
//            int m=a.length();
//            int n=b.length();
//            StringBuilder a1=new StringBuilder(a);
//            StringBuilder b1=new StringBuilder(b);
//            return lcs(m-1,n-1,a1,b1);
//        }
//        int lcs(int i,int j,StringBuilder a, StringBuilder b) {
//
//            if(i<0 || j<0)return 0;
//            if(a.charAt(i)==b.charAt(j)){
//                return 1+lcs(i-1,j-1,a,b);
//            }
//            else{
//                return Math.max(lcs(i-1,j,a,b),lcs(i,j-1,a,b));
//            }
//        }
//    }

//    by memoization , time complexity=O(m*n) , space complexity=O(m*n)
class Solution {
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
