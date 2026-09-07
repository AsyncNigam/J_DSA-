package Zeus_stroke.basic_questions;

import java.util.HashMap;

public class q4_majority_elements {
    class Solution {
        public int majorityElement(int[] nums) {
            HashMap<Integer, Integer> map=new HashMap<>();
            for(int ele:nums){
                map.put(ele, map.getOrDefault(ele,0)+1);
            }
            for(int ele:map.keySet()){
                if(map.get(ele)>=nums.length/2.0)return ele;
            }
            return -1;
        }
    }
}
