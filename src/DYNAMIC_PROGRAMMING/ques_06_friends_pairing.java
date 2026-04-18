package DYNAMIC_PROGRAMMING;

public class ques_06_friends_pairing {
    // User function Template for Java

//    normal approach
//    class Solution {
//        public long countFriendsPairings(int n) {
//            if(n<=2)return n;
//            return countFriendsPairings(n-1)+(n-1)*countFriendsPairings(n-2);
//        }
//    }

//    for memoization




//    for tabulation, time=O(n), space=O(n)
class Solution {
    public long countFriendsPairings(int n) {
        if(n<=2)return n;
        int[] dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;

        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+(i-1)*dp[i-2];
        }
        return dp[n];
    }
}

//for memoization   time=O(n), space=O(n)
//class Solution {
//    public long countFriendsPairings(int n) {
//
//        long[] dp=new long[n+1];
//        Arrays.fill(dp,-1);
//        return memo(n,dp);
//    }
//
//    long memo(int n,long[] dp){
//         if(n<=2)return n;
//         if(dp[n]!=-1)return dp[n];
//        return dp[n]=memo(n-1,dp)+(n-1)*memo(n-2,dp);
//    }
//
//}
}
