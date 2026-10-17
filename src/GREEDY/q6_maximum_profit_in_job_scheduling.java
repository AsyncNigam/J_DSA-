package GREEDY;

import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/problems/maximum-profit-in-job-scheduling/description/
public class q6_maximum_profit_in_job_scheduling {


    class Solution {
        private class Job {
            int start, end, profit;
            Job(int start, int end, int profit) {
                this.start = start;
                this.end = end;
                this.profit = profit;
            }
        }

        public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
            int n = startTime.length;
            Job[] jobs = new Job[n];
            for (int i = 0; i < n; i++) {
                jobs[i] = new Job(startTime[i], endTime[i], profit[i]);
            }

            // Sort strictly by end time to maintain chronological DP state
            Arrays.sort(jobs, (a, b) -> Integer.compare(a.end, b.end));

            // dp[i] represents the maximum profit achievable up to the i-th job
            int[] dp = new int[n];
            dp[0] = jobs[0].profit;

            for (int i = 1; i < n; i++) {
                int currentProfit = jobs[i].profit;

                // Binary search to find the latest job that finishes before the current job starts
                int latestNonConflict = searchNonConflictingJob(jobs, i);
                if (latestNonConflict != -1) {
                    currentProfit += dp[latestNonConflict];
                }

                // State transition: Max of (excluding current job, including current job)
                dp[i] = Math.max(dp[i - 1], currentProfit);
            }

            return dp[n - 1];
        }

        private int searchNonConflictingJob(Job[] jobs, int currentIndex) {
            int left = 0;
            int right = currentIndex - 1;
            int result = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (jobs[mid].end <= jobs[currentIndex].start) {
                    result = mid; // Valid job found, try to find a later one
                    left = mid + 1;
                } else {
                    right = mid - 1; // Job ends too late, search earlier
                }
            }
            return result;
        }
    }
}
