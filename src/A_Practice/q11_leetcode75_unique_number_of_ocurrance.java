package A_Practice;

import java.util.HashMap;
import java.util.HashSet;

public class q11_leetcode75_unique_number_of_ocurrance {
    class Solution {
        public boolean uniqueOccurrences(int[] arr) {
            HashMap<Integer, Integer> map=new HashMap<>();
            for(int ele:arr){
                map.put(ele, map.getOrDefault(ele, 0)+1);
            }

            HashSet<Integer> set=new HashSet<>();
            for(int ele: map.keySet()){
                set.add(map.get(ele));
            }
            return set.size()==map.size();


        }
    }
}
