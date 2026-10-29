package Zeus_stroke.q1_arrays;

import java.util.HashMap;

public class q15_subarray_sum_equals_k {

//    brute force approach
    class Solution {
        public int subarraySum(int[] nums, int k) {
            int n=nums.length;
            int count=0;
            for(int i=0;i<n;i++){
                int s=0;
                for(int j=i;j<n;j++){
                    s+=nums[j];
                    if(s==k){
                        count++;
                        break;}
                }
            }
            return count;
        }
    }


//    optimal solution
class Solution2 {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(0,1);

        int current_sum=0;
        int count=0;
        for(int num:nums){
            current_sum+=num;
            int target=current_sum - k;
            if(map.containsKey(target)){
                count+=map.get(target);
            }
            map.put(current_sum, map.getOrDefault(current_sum, 0)+1);
        }
        return count;
    }
}
}
