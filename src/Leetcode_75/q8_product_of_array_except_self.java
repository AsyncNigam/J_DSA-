package Leetcode_75;
//In this question don't try to use this intuition: you will think, "I will first find out the product, then I will divide that by the individual element, and I'll get the other element's value. I'll store that." No, in that intuition there are some flaws.
//
//One of the flaws is: what if 0 is present among the other elements? If one element is 0 and the array does not contain any other 0, that means the product will be 0. When the pointer comes to that specific 0, that 0 is not present and that's where there will be a product.
//
//When there are multiple zeros you have to also give a flag for whether 0 is present or not and whether multiple zeros are present or not. For elements you also have to calculate for the negative elements. When there are negative elements you also have to calculate whether an odd number or an even number of negative elements is present and you have to calculate all that stuff.
//
//To get rid of it try to find out the prefix and then the suffix. That will be enough.
public class q8_product_of_array_except_self {
    class Solution {
        public int[] productExceptSelf(int[] nums) {

            int[] res=new int[nums.length];
            res[0]=1;
            for(int i=1;i< nums.length;i++){
                res[i]=res[i-1]*nums[i-1];
            }

            int suffix = 1;
            for (int i = nums.length - 1; i >= 0; i--) {
                res[i] = res[i] * suffix;
                suffix *= nums[i];
            }

            return res;
        }
    }
}
