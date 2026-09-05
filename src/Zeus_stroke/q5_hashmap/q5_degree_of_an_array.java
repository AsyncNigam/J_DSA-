package Zeus_stroke.q5_hashmap;

import java.util.HashMap;
//https://leetcode.com/problems/degree-of-an-array/

public class q5_degree_of_an_array {
    class Solution {
        public int findShortestSubArray(int[] nums) {
            HashMap<Integer, Integer> map=new HashMap<>();
            HashMap<Integer, Integer> map_first=new HashMap<>();
            HashMap<Integer, Integer> map_last=new HashMap<>();


            for(int i=0;i<nums.length;i++){
                int ele=nums[i];
                map.put(ele, map.getOrDefault(ele,0)+1);
                if(!map_first.containsKey(ele))map_first.put(ele,i);
                map_last.put(ele, i);
            }


            int maxValue = Integer.MIN_VALUE;
            int max_subArray=0;

            for(int ele:map.keySet()){
                int value=map.get(ele);
                int curr_length=map_last.get(ele)-map_first.get(ele)+1;
                if(value>maxValue){
                    maxValue=value;
                    max_subArray=curr_length;
                }
                else if(value==maxValue){
                    max_subArray=Math.min(max_subArray, curr_length);
                }
            }

            return max_subArray;


        }
    }
}
