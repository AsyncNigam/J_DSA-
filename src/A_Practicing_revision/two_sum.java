package A_Practicing_revision;

import java.util.HashMap;

public class two_sum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map=new HashMap<>();
            for(int i=0;i<nums.length;i++){
                if(map.containsKey(nums[i]))return new int[]{i,map.get(nums[i])};
                else map.put(target-nums[i],i);
            }
            return new int[]{-1,-1};
        }
    }
}
