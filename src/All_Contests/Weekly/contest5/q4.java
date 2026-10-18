package All_Contests.Weekly.contest5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/minimum-interval-selection-to-cover-target-intervals/
public class q4 {
    class Solution {
        public int minSelection(int[][] availableIntervals, int[][] targetIntervals) {
            Arrays.sort(targetIntervals, (a, b) -> Integer.compare(a[0], b[0]));
            List<int[]> mergedTargets = new ArrayList<>();
            for (int[] t : targetIntervals) {
                if (mergedTargets.isEmpty() || mergedTargets.get(mergedTargets.size() - 1)[1] < t[0]) {
                    mergedTargets.add(new int[]{t[0], t[1]});
                } else {
                    int[] last = mergedTargets.get(mergedTargets.size() - 1);
                    last[1] = Math.max(last[1], t[1]);
                }
            }

            Arrays.sort(availableIntervals, (a, b) -> Integer.compare(a[0], b[0]));

            int count = 0;
            int i = 0;
            int n = availableIntervals.length;
            int maxEnd = -1;
            int coveredEnd = -1;

            for (int[] target : mergedTargets) {
                int tStart = target[0];
                int tEnd = target[1];
                if (coveredEnd >= tEnd) {
                    continue;
                }
                int cur = Math.max(tStart, coveredEnd);
                if (cur == tEnd) {
                    while (i < n && availableIntervals[i][0] <= cur) {
                        maxEnd = Math.max(maxEnd, availableIntervals[i][1]);
                        i++;
                    }
                    if (maxEnd < cur) {
                        return -1;
                    }
                    count++;
                    coveredEnd = maxEnd;
                    continue;
                }
                while (cur < tEnd) {
                    while (i < n && availableIntervals[i][0] <= cur) {
                        maxEnd = Math.max(maxEnd, availableIntervals[i][1]);
                        i++;
                    }
                    if (maxEnd <= cur) {
                        return -1;
                    }
                    count++;
                    cur = maxEnd;
                    coveredEnd = maxEnd;
                }
            }

            return count;
        }
    }
}
