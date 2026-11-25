package DYNAMIC_PROGRAMMING;

import java.util.Arrays;
//In unbounded knapsack you can pick any element infinite times. There is no specific quantity like in 0/1 knapsack, where a certain element is just present or not.
//
//Here you will be given the value array and the weight array, meaning that the specific weight contains this much value. You can pick that element a finite number of times. That element is present only a finite number of times. How many times you pick one, you can pick that.
//
//The code is not that much different from it, just a single line different: in this picking you just don't go to the next index, instead stay there, just check while picking that, and skip the same one. All 99% of the code is the same as 0/1 app set. Nothing changed.
public class ques_14_unbounded_knapsack {

//    by memoization time=O(n*c) ,space=O(n*c),
//    here i =  0 to n-1 and c= c to 0 (c is capacity)
//    as here 2 things are varying i and c , so here there will be a 2d dp


    //  for the size of the dp , look the variables in normal recursion method which are changing , then see the no. of times they are changing that will be the size of the row or column
    class Solution2 {
        public int knapsack(int c, int val[], int wt[]) {
            // code here
            int n = val.length;
            int[][] dp = new int[n][c + 1];
            for (int i = 0; i < n; i++) Arrays.fill(dp[i], -1);
            return profit(0, c, val, wt, dp);
        }

        int profit(int i, int c, int[] val, int[] wt, int[][] dp) {
            if (i == wt.length) return 0;
            if (dp[i][c] != -1) return dp[i][c];
            int skip = profit(i + 1, c, val, wt, dp);
            if (wt[i] > c) return dp[i][c] = skip;
            int take = val[i] + profit(i , c - wt[i], val, wt, dp);
            // Just the change is that we are not going to the next index. We're just staying at that index `i` and this is the only line different from that. 01 appsec: all the other lines are exactly copy-pasting. This here also: we are just staying on that, saying our index `i` instead of going `i + 1`.
            return dp[i][c] = Math.max(skip, take);
        }
    }
}
