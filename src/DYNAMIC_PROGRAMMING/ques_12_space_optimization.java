package DYNAMIC_PROGRAMMING;

public class ques_12_space_optimization {

//    for fibonacci ,
//    class Solution {
//    public int fib(int n) {
//        if(n<=1)return n;
//        int[] dp=new int[3];
//        dp[0]=0;
//        dp[1]=1;
//        for(int i=2;i<=n;i++){
//            dp[2]=dp[0]+dp[1];
//            dp[0]=dp[1];
//            dp[1]=dp[2];
//        }
//        return dp[2];
//    }
//}


//    for unique paths space optimization

//  class Solution {
//    public int uniquePaths(int m, int n) {
//       int[][] dp=new int[2][n];
//       Arrays.fill(dp[0],1);
//       Arrays.fill(dp[1],1);
//
//       for(int i=1;i<=m-1;i++){
//            //i runs for m-1;
//            for(int j=1;j<n;j++){
//                dp[1][j]=dp[1][j-1]+dp[0][j];
//            }
//
//            // for copying the 2nd row to 1st
//            for(int j=1;j<n;j++){
//                dp[0][j]=dp[1][j];
//            }
//       }
//       return dp[1][n-1];
//    }
//  }

//    without copying the 2nd row to 1st

//    class Solution {
//    public int uniquePaths(int m, int n) {
//       int[][] dp=new int[2][n];
//       Arrays.fill(dp[0],1);
//       Arrays.fill(dp[1],1);
//
//       for(int i=1;i<=m-1;i++){
//            //i runs for m-1;
//            if(i%2==1){ //for odd i
//                 for(int j=1;j<n;j++){
//                        dp[1][j]=dp[1][j-1]+dp[0][j];
//                     }
//            }
//
//          else{  //for even i
//                 for(int j=1;j<n;j++){
//                        dp[0][j]=dp[0][j-1]+dp[1][j];
//                     }
//          }
//       }
//       return Math.max(dp[1][n-1],dp[0][n-1]);
//    }
//}

}
