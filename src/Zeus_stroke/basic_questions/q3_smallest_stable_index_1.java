package Zeus_stroke.basic_questions;

public class q3_smallest_stable_index_1 {
    class Solution {
        public int firstStableIndex(int[] nums, int k) {
            int n=nums.length;
            int[] preMax=new int[n];
            int[] sufMin=new int[n];

            preMax[0]=nums[0];
            sufMin[n-1]=nums[n-1];
            for(int i=1;i<nums.length;i++){
                preMax[i]=Math.max(preMax[i-1],nums[i]);
            }
            for(int i=n-2;i>=0;i--){
                sufMin[i]=Math.min(sufMin[i+1],nums[i]);
            }
            int score=0;
            for(int i=0;i<n;i++){
                score=preMax[i]-sufMin[i];
                if(score<=k)return i;
            }
            return -1;
        }
    }
}
