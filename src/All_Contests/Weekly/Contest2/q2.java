package All_Contests.Weekly.Contest2;

import java.util.HashMap;

//https://leetcode.com/problems/maximum-equal-adjacent-pairs-after-at-most-one-replacement/

public class q2 {

    class Solution {
        public int maxEqualAdjacentPairs(int[] nums) {
            int n=nums.length;
            HashMap<String, Integer> map=new HashMap<>();
            int equal=0;
            int unequal=0;
            for(int i=1;i<n;i++){
                int a=nums[i];
                int b=nums[i-1];
                if(a==b)equal++;
                else{
                    int min=Math.min(a,b);
                    int max=Math.max(a,b);

                    String str=min+"#"+max;
                    int count=map.getOrDefault(str,0)+1;
                    map.put(str,count);

                    unequal=Math.max(unequal , count);
                }

            }

            return equal+unequal;
        }
    }
}
