package DYNAMIC_PROGRAMMING;

public class ques_07_climbing_stairs {

//    without recusion by just normal for loop and O(n) time like solving the Fibonacci with the for loop styel

    class Solution {
        public int climbStairs(int count) {
            int num1=1;
            int num2=2;
            if(count==2)return 2;
            if(count==1)return 1;

            for (int i = 2; i < count; i++) {
                int sumOfPrevTwo = num1 + num2;
                num1 = num2;
                num2 = sumOfPrevTwo;
            }
            return num2;
        }

    }

//    with recursion
    class Solution2 {
        public int climbStairs(int n) {
            if(n<=2)return n;
            return climbStairs(n-1) + climbStairs(n-2);
        }
    }

//    with memoization dp
    class Solution3 {
        public int climbStairs(int n) {
            int[] dp=new int[n+1];
            return climbing(n,dp);
        }
        int climbing(int n, int[] dp){
            if(n<=2)return n;
            if(dp[n]!=0)return dp[n];
            return dp[n]=climbing(n-1,dp)+climbing(n-2,dp);
        }
    }

//    with tabulation method
        class Solution4 {
            public int climbStairs(int n) {
                if(n<3)return n;
                int[] dp=new int[n+1];
                dp[1]=1;
                dp[2]=2;
                for(int i=3;i<=n;i++){
                    dp[i]=dp[i-1]+dp[i-2];
                }
                return dp[n];
            }
        }

}
