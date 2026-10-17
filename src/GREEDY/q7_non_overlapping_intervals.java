package GREEDY;

import java.util.Arrays;

//https://leetcode.com/problems/non-overlapping-intervals/

public class q7_non_overlapping_intervals {
    class Solution {
        public int eraseOverlapIntervals(int[][] intervals) {
            Arrays.sort(intervals, (a, b)->Integer.compare(a[1],b[1]));
            int count=1;
            int lastEndTime=intervals[0][1];
            for(int i=1;i<intervals.length;i++){
                if(intervals[i][0]>=lastEndTime){
                    count++;
                    lastEndTime=intervals[i][1];
                }
            }
            return intervals.length-count;
        }
    }
}
