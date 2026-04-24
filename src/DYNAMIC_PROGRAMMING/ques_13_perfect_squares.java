package DYNAMIC_PROGRAMMING;

import java.util.Arrays;

public class ques_13_perfect_squares {

//    brute force by normal recursion but tle

//    class Solution {
//        public int numSquares(int n) {
//            if(isPerfect(n))return 1;
//            int min=Integer.MAX_VALUE;
//            for(int i=1;i<=n/2;i++){
//                int count=numSquares(i)+numSquares(n-i);
//                min=Math.min(count,min);
//            }
//            return min;
//        }
//        public boolean isPerfect(int n){
//            int sq=(int)Math.sqrt(n);
//            return sq*sq==n;
//        }
//    }


//    by more optimization this will also give tle

//    class Solution {
//     public int numSquares(int n) {
//       int[] dp=new int[n+1];
//       Arrays.fill(dp,-1);
//        return minSquares(n,dp);
//    }
//    public int minSquares(int n,int[] dp) {
//        if(isPerfect(n))return 1;
//        if(dp[n]!=-1)return dp[n];
//        int min=Integer.MAX_VALUE;
//        for(int i=1;i<=n/2;i++){
//            int count=minSquares(i,dp)+minSquares(n-i,dp);
//            min=Math.min(count,min);
//        }
//        return dp[n]=min;
//    }
//    public boolean isPerfect(int n){
//        int sq=(int)Math.sqrt(n);
//        return sq*sq==n;
//    }
//}



//    we can more optimize the previous answer , likely changing the for loop range from n/2 to sqr root of n
//class Solution { // t.c=O(n*n^1/2)
//    public int numSquares(int n) {
//        int[] dp=new int[n+1];
//        Arrays.fill(dp,-1);
//        return minSquares(n,dp);
//    }
//    public int minSquares(int n,int[] dp) {
//        if(isPerfect(n))return 1;
//        if(dp[n]!=-1)return dp[n];
//        int min=Integer.MAX_VALUE;
//        for(int i=1;i*i<=n;i++){
//            int count=minSquares(i*i,dp)+minSquares(n-i*i,dp);
//            min=Math.min(count,min);
//        }
//        return dp[n]=min;
//    }
//    public boolean isPerfect(int n){
//        int sq=(int)Math.sqrt(n);
//        return sq*sq==n;
//    }
//}


//    by tabulation method
class Solution {
    public int numSquares(int n) {
        int[] dp=new int[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++){
            if(isPerfect(i))dp[i]=1;
            else{
                int min=Integer.MAX_VALUE;
                for(int j=1; j*j<=i; j++){
                    int c=dp[j*j] + dp[i-j*j];
                    min=Math.min(min,c);
                }
                dp[i]=min;
            }
        }
        return dp[n];
    }

    public boolean isPerfect(int n){
        int sq=(int)Math.sqrt(n);
        return sq*sq==n;
    }
}
}
