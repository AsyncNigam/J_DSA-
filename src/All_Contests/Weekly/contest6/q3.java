package All_Contests.Weekly.contest6;

import java.util.HashMap;
import java.util.Map;
//https://leetcode.com/problems/count-frequency-staircase-subarrays-i/
public class q3 {
    class Solution {
        public int countStaircase(int[] nums) {
            int n=nums.length;
            int count=0;
            for(int i=0;i<n;i++){
                Map<Integer, Integer> freq=new HashMap<>();
                Map<Integer, Integer> order=new HashMap<>();
                int k=0;
                int validCount=0;
                for(int j=i;j<n;j++){
                    if(!order.containsKey(nums[j])){
                        k++;
                        freq.put(nums[j],0);
                        order.put(nums[j],k);
                    }
                    int oldf=freq.get(nums[j]);
                    int newf=oldf+1;
                    freq.put(nums[j],newf);


                    int expectf=order.get(nums[j]);

                    if(expectf==oldf)validCount--;
                    if(expectf==newf)validCount++;

                    if(validCount==k)count++;

                }
            }
            return count;
        }
    }
}
