package Zeus_stroke.q1_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// this is same as the three sum question here just an extra target and we have to find the an additional pair

// time complexity is O(n^3) because sorting O(nLogn) , 2 for loops and in side two pointer while loop is O(n^3) so total tc is O(n^3)

// space complexity is O(log n) to O(n) due to sorting of the array

public class q6_four_sum {
    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            Arrays.sort(nums);
            int n=nums.length;
            List<List<Integer>> list=new ArrayList<>();
            for(int l=0;l<n;l++){
                if (l > 0 && nums[l] == nums[l - 1]) continue;
                for(int i=l+1;i<n;i++){
                    if(i>l+1 && nums[i]==nums[i-1])continue;
                    int j=i+1;
                    int k=n-1;
                    while(j<k){
                        long sum = (long) nums[l] + nums[i] + nums[j] + nums[k];
                        if(sum<target)j++;
                        else if(sum>target)k--;
                        else {
                            list.add(Arrays.asList(nums[l],nums[i],nums[j],nums[k]));
                            j++;
                            k--;
                            while (j < k && nums[j] == nums[j - 1]) j++;
                            while (j < k && nums[k] == nums[k + 1]) k--;}

                    }
                }
            }
            return list;
        }
    }
}
