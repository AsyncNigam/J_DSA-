package All_Contests.Biweekly.contest2;

import java.util.HashMap;

//https://leetcode.com/contest/biweekly-contest-193/problems/maximum-product-pair-with-target-sum/description/

public class q1 {
    class Solution {
        public int[] maxProductPair(int[] nums, int target) {
            int max=Integer.MIN_VALUE;
            int n=nums.length;
            HashMap<Integer, Integer> map = new HashMap<>();
            int[] pair = {-1, -1};

            for (int i = 0; i < n; i++) {
                int el = target - nums[i];

                if (map.containsKey(el) && nums[i] != el) {
                    int j = map.get(el);
                    int pro = nums[i] * el;

                    if (max < pro) {
                        max = pro;
                        if(nums[i]>nums[j]){
                            pair[0] = i;
                            pair[1] = j;
                        }
                        else{
                            pair[0] = j;
                            pair[1] = i;
                        }
                    }
                }

                map.put(nums[i], i);
            }

            return pair;
        }
    }
}
