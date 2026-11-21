package DYNAMIC_PROGRAMMING;

public class ques_01_fibonacci {
//    for brute force approach
//    tc is O(2^n) , sc is O(n)
//    it is pure recursive branching so O(2^n)

    class Solution1 {
        public int fib(int n) {
            if(n<=1)return n;
            return fib(n-1)+fib(n-2);
        }
    }

//    recursion + memoization  top-down approach
//    time complexity is O(n), and extra space is O(n)
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


//by tabulation methods bottom up approach
//  same  time complexity is O(n), and extra space is O(n)

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

// Best of all 2pointers
//    tc is O(n) sc is constant O(1)

class Solution5 {
    public int fib(int n) {
        int a=0;
        int b=1;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=a+b;
            a=b;
            b=sum;
        }

        return a;
    }
}
}
