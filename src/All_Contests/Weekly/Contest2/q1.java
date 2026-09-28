package All_Contests.Weekly.Contest2;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class q1 {

// https://leetcode.com/problems/rearrange-array-by-removing-distinct-values/
    class Solution {
        public int[] rearrangeArray(int[] nums) {
            TreeMap<Integer, Integer> map=new TreeMap<>();
            for(int el : nums){
                map.put(el,map.getOrDefault(el, 0)+1);
            }
            int n=nums.length;
            int[] ans=new int[n];
            int i=0;
            while(!map.isEmpty()){
                Iterator<Map.Entry<Integer, Integer>> it =
                        map.entrySet().iterator();

                while(it.hasNext()){
                    Map.Entry<Integer, Integer> entry = it.next();

                    ans[i++] = entry.getKey();

                    int count = entry.getValue() - 1;

                    if (count == 0) {
                        it.remove();
                    } else {
                        entry.setValue(count);
                    }
                }
            }
            return ans;




        }
    }
}
