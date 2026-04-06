package A_Practicing_revision;

public class move_zeros {

//     my approach is if nonZero then equate , then for the rest equals to 0

//     "Overwrite" Approach

//    class Solution {
//        public void moveZeroes(int[] nums) {
//            int  non0=0;
//            for(int i=0;i<nums.length;i++){
//                if(nums[i]!=0){
//                    nums[non0++]=nums[i];
//                }
//            }
//            while(non0<nums.length)nums[non0++]=0;
//        }
//    }

//    other approach with the same time complexity SWAP APPROACH

class Solution {
    public void swap(int a,int b,int[] nums){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=0;
        while(j<n){
            if(nums[j]!=0){
                swap(i,j,nums);
                i++;
            }
            j++;
        }
    }
}
}
