package Zeus_stroke.q1_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q8_merge_intervals {
    class Solution {
        public int[][] merge(int[][] intervals) {
            if(intervals.length<2)return intervals;

            Arrays.sort(intervals, (a, b)->Integer.compare(a[0],b[0]));
            List<int[]> res=new ArrayList<>();
            int[] currInterval=intervals[0];
            res.add(currInterval);

            for(int[] interval : intervals){
                if(currInterval[1]>=interval[0])currInterval[1]=Math.max(currInterval[1],interval[1]);

                else{
                    currInterval=interval;
                    res.add(currInterval);
                }
            }

            return res.toArray(new int[res.size()][]);
        }
    }
}
