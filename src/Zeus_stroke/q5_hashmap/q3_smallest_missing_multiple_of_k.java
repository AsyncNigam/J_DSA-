package Zeus_stroke.q5_hashmap;

import java.util.HashSet;
import java.util.Set;

public class q3_smallest_missing_multiple_of_k {
    class Solution {
        public int missingMultiple(int[] nums, int k) {


            int ans = 0;

            Set<Integer> s = new HashSet<>();
            for (int n : nums) {
                s.add(n);
            }

            for(int i=1;i<=nums.length+1;i++){  // here the maximum limit is nums length +1 because if bigger one will come then in some middle part should be absent and if gradually increasers then nums.length+1 multiple will be the answer
                if(!s.contains(k*i)){
                    ans=k*i;
                    break;
                }
            }
            return ans;

        }
    }
}
