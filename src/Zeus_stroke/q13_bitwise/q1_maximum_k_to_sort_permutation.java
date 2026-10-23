package Zeus_stroke.q13_bitwise;

public class q1_maximum_k_to_sort_permutation {
    class Solution {
        public int sortPermutation(int[] nums) {
            int temp=-1;
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=i){
                    temp=temp&nums[i];
                }
            }
            if(temp==-1)return 0;
            return temp;
        }
    }
}
