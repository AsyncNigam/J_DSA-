package DYNAMIC_PROGRAMMING;

public class ques_01_fibonacci {
//    for brute force approach

    class Solution1 {
    public int fib(int n) {
        if(n<=1)return n;
        return fib(n-1)+fib(n-2);
    }
}

//    recursion + memoization time complexity is O(n), and extra space is O(n)
    class Solution2 {
        public int fib(int n) {
            int[] dp=new int[n+1];
            return fibo(n,dp);

        }
        public int fibo(int n,int[] dp){
            if(n<=1)return n;
            if(dp[n]!=0)return dp[n];
            int ans=fibo(n-1,dp)+fibo(n-2,dp);
            dp[n]=ans;
            return ans;
        }
    }


//    in more optimized way of writing
class Solution3 {
    public int fib(int n) {
        int[] dp=new int[n+1];
        return fibo(n,dp);
    }
    public int fibo(int n,int[] dp){
        if(n<=1)return n;
        if(dp[n]!=0)return dp[n];
        return dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
    }
}


//by tabulation methods

    class Solution4 {
    public int fib(int n) {
        if(n<=1)return n;
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
}
