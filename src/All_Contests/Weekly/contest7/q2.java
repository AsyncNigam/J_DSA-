package All_Contests.Weekly.contest7;
//https://leetcode.com/contest/weekly-contest-527/problems/count-valid-suffix-sorts-i/
import java.util.Arrays;

public class q2 {
    class Solution {
        public int countSuffix(int[] nums, int[] target) {
            int n=nums.length;
            int[] nums2=nums.clone();
            int[] target2=target.clone();
            Arrays.sort(nums2);
            Arrays.sort(target2);
            if(!Arrays.equals(nums2, target2))return 0;

            int firstDiff=n-1;
            for(int k=0;k<n;k++){
                if(nums[k]!=target[k]){
                    firstDiff=k;
                    break;
                }
            }

            int start=n-1;
            while(start>0 && target[start-1]>=target[start])start--;
            if(start<=firstDiff)return firstDiff-start+1;
            return 0;
        }
    }
}
