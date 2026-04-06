package A_Practicing_revision;

public class maximum_subarray_sum {

//    this is the brute force appraoch but it has exceeding time complexity

//    class Solution {
//        public int maxSubArray(int[] nums) {
//            int msum=nums[0];
//            for(int i=0;i<nums.length;i++){
//                int sum=0;
//                for(int j=i;j<nums.length;j++){
//                    sum+=nums[j];
//                    msum=Math.max(msum,sum);
//                }
//            }
//            return msum;
//        }
//    }



//    with kadane's algorithm with time O(n)
class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum=nums[0];
        int current_sum=0;
        for(int i=0;i<nums.length;i++){
            current_sum+=nums[i];
            max_sum=Math.max(max_sum,current_sum);
            if(current_sum<0)current_sum=0;
        }
        return max_sum;
    }
}
}
