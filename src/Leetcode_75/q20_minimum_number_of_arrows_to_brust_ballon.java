package Leetcode_75;

import java.util.Arrays;

public class q20_minimum_number_of_arrows_to_brust_ballon {
    class Solution {
        public int findMinArrowShots(int[][] points) {
            if (points == null || points.length == 0) {
                return 0;
            }
            Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
            int count=1;
            int currentEnd=points[0][1];
            for(int i=1;i<points.length;i++){
                if(points[i][0]>currentEnd){
                    count++;
                    currentEnd=points[i][1];
                }
            }
            return count;
        }
    }
}
