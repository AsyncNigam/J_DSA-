package Zeus_stroke.q1_arrays;

public class q10_median_of_2_sorted_array {
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {

            int m=nums1.length;
            int n=nums2.length;

            int len=m+n;

            int[] ans=new int[len];
            int i=0;
            int j=0;
            int k=0;
            while(i<m && j<n){
                if(nums1[i]<nums2[j]){
                    ans[k]=nums1[i];
                    i++;
                }else{
                    ans[k]=nums2[j];
                    j++;
                }
                k++;
            }
            while(i<m){
                ans[k]=nums1[i];
                i++;
                k++;
            }
            while(j<n){
                ans[k]=nums2[j];
                j++;
                k++;
            }



            if(len%2==0)return (ans[len/2]+ans[len/2-1])/2.0;
            return ans[len/2];

        }
    }
}
