package Zeus_stroke.q5_hashmap;

import java.util.HashMap;

public class q1_count_elements_with_maximum_frequencies {
    class Solution {

        public int maxFrequencyElements(int[] nums) {
            HashMap<Integer, Integer> map=new HashMap<>();
            for(int i=0;i<nums.length;i++){
                map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);
            }
            int max_len=0;
            int mVal=0;

            for(int i:map.keySet()){
                if(max_len<map.get(i)){
                    max_len=map.get(i);
                    mVal=max_len;
                }
                else if(max_len == map.get(i))mVal+=max_len;
            }
            return mVal;
        }
    }
}
