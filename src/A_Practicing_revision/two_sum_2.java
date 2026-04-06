package A_Practicing_revision;

//pair sum leetcode 167

public class two_sum_2 {
    class Solution {
        public int[] twoSum(int[] arr, int target) {
            int s=0;
            int e=arr.length-1;

            while(s<=e){
                if((arr[s]+arr[e])==target)return new int[]{s+1,e+1};
                else if((arr[s]+arr[e])>target) e--;
                else s++;
            }

            return new int[]{-1,-1};
        }
    }

}
