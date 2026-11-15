package HashMaps_And_sets.Maps;

import java.util.HashMap;

public class q10_equal_row_and_column_pairs {
    class Solution {
        public int equalPairs(int[][] grid) {
            HashMap<String, Integer> map=new HashMap<>();
            for(int i=0;i<grid.length;i++){
                String s="";
                for(int ele : grid[i])s+=ele+"#";
                map.put(s,map.getOrDefault(s,0)+1);
            }
            int count=0;
            for(int i=0;i<grid.length;i++){
                String s="";
                for(int j=0;j<grid[i].length;j++)s+=grid[j][i]+"#";
                if(map.containsKey(s))count+=map.get(s);
            }
            return count;
        }
    }
}
