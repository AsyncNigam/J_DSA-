package A_Practicing_revision;

import java.util.HashMap;
import java.util.Map;

public class leetcode_1_two_sum {

//    most optimized way by hashing , unordered map

//    methods used in it are containsKey(), put(key,value) , get(key) .. here we are storing element as key and their index as value

//    since target should sum of 2 elements , so 2nd element=target-1st element

//    if 2nd element exists in map return otherwise add the 1st to map.


class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int first=nums[i];
            int sec=target-first;
            if(map.containsKey(sec)){
                return new int[]{i,map.get(sec)};
            }
            map.put(first,i);
        }
        return new int[]{-1,-1};
    }
}
}
