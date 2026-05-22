package A_Practice;

//youtube video solution https://youtu.be/yEFlGWOVH8g?si=8jz_3cWXrtURc_3T
//leetcode link https://leetcode.com/problems/increasing-triplet-subsequence/description/?envType=study-plan-v2&envId=leetcode-75


public class q5_increasing_triplet_subsequence {

//    this is the brute force approach with t.c. O(n^3)
//    class Solution {
//        public boolean increasingTriplet(int[] nums) {
//            for(int i=0;i<nums.length-2;i++){
//                for(int j=i+1;j<nums.length-1;j++){
//                    for(int k=j+1;k<nums.length;k++){
//                        if(nums[i]<nums[j] && nums[j]<nums[k])return true;
//                    }
//                }
//            }
//            return false;
//        }
//    }


//    the O(1) ways is taking 3 variables and storing maximum value in them and then iterating over the array and if element coming is less than a then storing and continuing is again nums come and now greater than store in b then again iterate if comes and greater than b then store in c ,
//class Solution {
//    public boolean increasingTriplet(int[] nums) {
//        int a = Integer.MAX_VALUE;
//        int b = Integer.MAX_VALUE;
//        int c = Integer.MAX_VALUE;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] <= a)
//                a = nums[i];
//            else if (nums[i] <= b)
//                b = nums[i];
//            else if (nums[i] <= c) {
//                c = nums[i];
//                return true;
//            }
//
//        }
//        return false;
//    }
//}

//    the more optimized way can be not keep 3rd varibale just return when it will come for the 3rd varibale
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= a)
                a = nums[i];
            else if (nums[i] <= b)
                b = nums[i];
            else
                return true;

        }
        return false;
    }
}


}
