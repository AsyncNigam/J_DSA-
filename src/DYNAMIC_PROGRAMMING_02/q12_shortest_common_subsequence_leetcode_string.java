package DYNAMIC_PROGRAMMING_02;


//here 1st we are finding the lcs string then keeping 3 pointers then tracking the scene is most likely like of merge sort
//here until matches lcs char add for a, then for b

//https://leetcode.com/problems/shortest-common-supersequence/
public class q12_shortest_common_subsequence_leetcode_string {
    class Solution {
        public String shortestCommonSupersequence(String a, String b) {
            String lcs = Longest_common_subsequence(a, b);
            int i = 0;
            int j = 0;
            int k = 0;
            String ans = "";
            while (i < a.length() && j < b.length() && k < lcs.length()) {
                while (a.charAt(i) != lcs.charAt(k)) {
                    ans += a.charAt(i);
                    i++;
                }
                while (b.charAt(j) != lcs.charAt(k)) {
                    ans += b.charAt(j);
                    j++;
                }
                ans += lcs.charAt(k);
                i++;
                j++;
                k++;
            }
            while (i < a.length()) {
                ans += a.charAt(i);
                i++;
            }
            while (j < b.length()) {
                ans += b.charAt(j);
                j++;
            }
            return ans;

        }

        String Longest_common_subsequence(String a, String b) {
            int m = a.length();
            int n = b.length();
            int[][] dp = new int[m + 1][n + 1];

            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    if (a.charAt(i - 1) == b.charAt(j - 1))
                        dp[i][j] = 1 + dp[i - 1][j - 1];
                    else
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }

            String str = "";
            int i = m, j = n;
            while (i > 0 && j > 0) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    str = a.charAt(i - 1) + str;
                    i--;
                    j--;
                } else if (dp[i - 1][j] > dp[i][j - 1])
                    i--;
                else
                    j--;
            }

            return str;
        }
    }
}
