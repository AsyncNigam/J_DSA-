package All_Contests.Weekly.Contest1;

import java.util.Arrays;

//https://leetcode.com/problems/number-of-intersecting-interval-pairs-ii/description/
public class q2 {
    class Solution {
        public long countIntersectingIntervals(int[][] intervals) {
            Arrays.sort(intervals,(a, b)->Integer.compare(a[0],b[0]));
            long count=0;
            int n=intervals.length;
            int[] starts=new int[n];
            for(int i=0;i<n;i++){
                starts[i]=intervals[i][0];
            }
            for(int i=0;i<n;i++){
                int target=intervals[i][1];
                int rightMost=bsearch(starts,target);
                if(rightMost>i){
                    count+=(rightMost-i);
                }
            }
            return count;
        }
        int bsearch(int[] starts, int target){
            int s=0;
            int e=starts.length-1;
            int ansIdx=-1;
            while(s<=e){
                int mid=s+(e-s)/2;
                if(starts[mid]<=target){
                    ansIdx=mid;
                    s=mid+1;
                }
                else e=mid-1;
            }
            return ansIdx;
        }
    }
}
