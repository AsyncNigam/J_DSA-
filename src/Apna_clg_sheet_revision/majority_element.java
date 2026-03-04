package Apna_clg_sheet_revision;

import java.util.Arrays;

public class majority_element {

//    this is the brute force approach


//    class Solution {
//        public int majorityElement(int[] nums) {
//
//            if(nums.length<2)return nums[0];
//            for(int i=0;i<nums.length-1;i++){
//                int count=1;
//                for(int j=i+1;j<nums.length;j++){
//                    if(nums[i]==nums[j])count++;
//                }
//                if(count>nums.length/2)return nums[i];
//            }
//            return -1;
//        }
//    }




//    with the sorting approach like 1st sort then compare with the next consequtive element

//        class Solution {
//            public int majorityElement(int[] nums) {
//
//                if(nums.length<2)return nums[0];
//                Arrays.sort(nums);
//
//                int count=1;
//                for(int i=0;i<nums.length-1;i++){
//                    if(nums[i]==nums[i+1])count++;
//                    else count=1;
//                    if(count>nums.length/2)return nums[i];
//                }
//                return -1;
//            }
//        }




//    Moor's voting algorithm

    class Solution {
        public int majorityElement(int[] nums) {
            int freq=0;
            int ans=0;
            for(int ele:nums){
                if(freq==0)ans=ele;
                if(ans==ele)freq++;
                else freq--;
            }
            return ans;
        }
    }

}
