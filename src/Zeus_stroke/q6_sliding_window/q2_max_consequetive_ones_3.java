package Zeus_stroke.q6_sliding_window;

public class q2_max_consequetive_ones_3 {
//    brute force by me

//    TC O(n^2)

//    class Solution {
//    public int longestOnes(int[] nums, int k) {
//        int n=nums.length;
//
//        int max=0;
//
//        for(int i=0;i<n;i++){
//        int num_zero=0;
//        int count=0;
//        for(int j=i;j<n;j++){
//            if(nums[j]==1)count++;
//           else if(nums[j]==0 && num_zero<k){
//                count++;
//                num_zero++;
//            }
//
//            else break;
//        }
//        max=Math.max(max,count);
//     }
//
//     return max;
//    }
//}

//    by sliding window approach , by left right and the sliding window O(n) time complexity

    class Solution {
        public int longestOnes(int[] nums, int k) {
            int max_subarray=0;
            int left=0;
            int zero=0;
            for(int right=0;right<nums.length;right++){
                if(nums[right]==0)zero++;
                while(zero>k){
                    if(nums[left]==0)zero--;
                    left++;
                }
                max_subarray=Math.max(max_subarray, right-left+1);
            }
            return max_subarray;
        }
    }
}
