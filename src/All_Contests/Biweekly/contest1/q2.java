package All_Contests.Biweekly.contest1;

import java.util.ArrayList;
import java.util.HashMap;

public class q2 {
    class Solution {
        public int countSpecialIntegers(int[] nums) {
            HashMap<Integer, ArrayList<Integer>> map=new HashMap<>();
            for(int i=0;i<nums.length;i++){
                if(map.containsKey(nums[i])){
                    map.get(nums[i]).add(i);
                }
                else{
                    map.put(nums[i],new ArrayList<Integer>());
                }
            }
        }
    }
}
