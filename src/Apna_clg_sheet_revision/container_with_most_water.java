package Apna_clg_sheet_revision;

public class container_with_most_water {
//brute force approach is with O(n^2)


//    https://leetcode.com/problems/container-with-most-water/

//    this is the two pointer approach i.e we are changing the pointers


    class Solution {
        public int maxArea(int[] height) {
            int n=height.length;
            int maxArea=Integer.MIN_VALUE;
            int i=0;
            int j=n-1;
            while(i<j){
                maxArea=Math.max(maxArea,(Math.min(height[i],height[j])*(j-i)));

                if (height[i] < height[j]) {
                    i++;
                } else {
                    j--;
                }

            }
            return maxArea;
        }
    }
}
