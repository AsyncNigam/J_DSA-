package DYNAMIC_PROGRAMMING;

public class ques_03_tribonacci_number {

//    basic approach like of Fibonacci series but here time limit exceeds
//    class Solution {
//        public int tribonacci(int n) {
//            if(n<=1)return n;
//            if(n==2)return 1;
//            return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
//        }
//    }

//    with memoization
class Solution {
    public int tribonacci(int n) {
        int[] dp=new int[n+1];
        return tribo(n,dp);
    }
    int tribo(int n,int[] dp){
        if(n<=1)return n;
        if(n==2)return 1;
        if(dp[n]!=0)return dp[n];
        return dp[n]=tribo(n-1,dp)+tribo(n-2,dp)+tribo(n-3,dp);
    }
}

//with tabulation

//class Solution {
//    public int tribonacci(int n) {
//        if(n<=1)return n;
//        if(n==2)return 1;
//        int[] dp=new int[n+1];
//        dp[0]=0;
//        dp[1]=1;
//        dp[2]=1;
//
//        for(int i=3;i<=n;i++){
//            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
//        }
//        return dp[n];
//    }
//}

//    with iterative approach

//    class Solution {
//    public int tribonacci(int n) {
//        if (n == 0) return 0;
//        if (n == 1 || n == 2) return 1;
//
//        int a = 0, b = 1, c = 1;
//        for (int i = 3; i <= n; i++) {
//            int next = a + b + c;
//            a = b;
//            b = c;
//            c = next;
//        }
//        return c;
//    }
//}


}
