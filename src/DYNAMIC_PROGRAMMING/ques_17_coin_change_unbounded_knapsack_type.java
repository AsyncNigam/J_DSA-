package DYNAMIC_PROGRAMMING;

public class ques_17_coin_change_unbounded_knapsack_type {

    class Solution {
        public long cointCount(int i, int[] coins, int amount, long[][] dp) {
            // Base case: If we have considered all coin types
            if (i == coins.length) {
                if (amount == 0) return 0; // No more coins needed to reach 0
                else return Integer.MAX_VALUE; // Not a valid combination
            }

            // Return memoized value if already calculated
            if (dp[i][amount] != -1) return dp[i][amount];

            // Option 1: Skip the current coin
            long skip = cointCount(i + 1, coins, amount, dp);

            // Option 2: Pick the current coin (only if its value is <= remaining amount)
            if (amount - coins[i] < 0) {
                return dp[i][amount] = skip;
            }

            // We add 1 to the count and stay at index 'i' because we can reuse the same coin
            long pick = 1 + cointCount(i, coins, amount - coins[i], dp);

            // Store and return the minimum of picking or skipping
            return dp[i][amount] = Math.min(skip, pick);
        }

        public int coinChange(int[] coins, int amount) {
            // Create DP table initialized with -1
            long[][] dp = new long[coins.length][amount + 1];
            for (int i = 0; i < dp.length; i++) {
                for (int j = 0; j < dp[0].length; j++) {
                    dp[i][j] = -1;
                }
            }

            int ans = (int) cointCount(0, coins, amount, dp);

            // If the answer is still the "infinity" value, it's impossible to make that amount
            if (ans >= Integer.MAX_VALUE) return -1;

            return ans;
        }
    }
}
