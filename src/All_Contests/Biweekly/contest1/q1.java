package All_Contests.Biweekly.contest1;

import java.util.HashMap;

public class q1 {
    class Solution {
        public int countSpecialIntegers(int[] nums) {
            HashMap<Integer, Integer> map=new HashMap<>();
            for(int ele: nums){
                map.put(ele,map.getOrDefault(ele,0)+1);
            }
            int count=0;

            for(int ele: map.keySet()){
                if(map.get(ele)==3 && is_wellspaced(ele,nums))count++;
            }

            return count;
        }
        boolean is_wellspaced(int ele,int[] nums){
            int i=0;
            int j=0;
            int k=0;
            for(int l=0; l<nums.length; l++){
                if(nums[l]==ele && i==0)i=l;
                else if(nums[l]==ele && j==0)j=l;
                else if(nums[l]==ele && k==0)k=l;
            }

            if(k-j==j-i)return true;
            return false;
        }
    }
}
