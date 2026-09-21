package All_Contests.Weekly.Contest1;

import java.util.Arrays;
//https://leetcode.com/problems/number-of-intersecting-interval-pairs-i/

public class q1 {
    class Solution {
        public int countIntersectingIntervals(int[][] intervals) {
            Arrays.sort(intervals,(a, b)->Integer.compare(a[0],b[0]));
            int n=intervals.length;
            int i=0,j=i+1;
            int count=0;
            while(i<n-1){
                if(j<n && intervals[i][1]>=intervals[j][0]){
                    count++;
                    j++;
                }
                else{
                    i++;
                    j=i+1;
                }

            }
            return count;

        }
    }
}
