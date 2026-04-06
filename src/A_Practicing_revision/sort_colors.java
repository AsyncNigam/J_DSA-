package A_Practicing_revision;

public class sort_colors {

//    https://leetcode.com/problems/sort-colors/


//  brute force approach is just by sorting


//    class Solution {
//        public void sortColors(int[] nums) {
//            mergeSort(nums);
//        }
//        void mergeSort(int[] arr) {
//            int n=arr.length;
//            if(n==1)return ;
//
//            int[] a=new int[n/2];
//            int[] b=new int[n-n/2];
//
//            int idx=0;
//            for(int i=0;i<a.length;i++)a[i]=arr[idx++];
//            for(int i=0;i<b.length;i++)b[i]=arr[idx++];
//
////        now send them for the merge_sort
//            mergeSort(a);
//            mergeSort(b);
//
//            merge(a,b,arr);
//        }
//        void merge(int[] a,int[] b,int[] arr){
//            int i=0,j=0,k=0;
//
//            while(i<a.length && j<b.length){
//                if(a[i]<=b[j])arr[k++]=a[i++];
//                else arr[k++]=b[j++];
//            }
//
//            while(i< a.length)arr[k++]=a[i++];
//            while(j<b.length)arr[k++]=b[j++];
//        }
//    }


//    APPROACH 2

//    as only 0,1& 2 present count individually and then set

//class Solution {
//    public void sortColors(int[] nums) {
//        int c0=0,c1=0,c2=0;
//        for(int ele:nums){
//            if(ele==0)c0++;
//            else if(ele==1)c1++;
//            else c2++;
//        }
//
//        for(int i=0;i<nums.length;i++){
//            if(c0!=0){nums[i]=0;
//                c0--;}
//            else if(c1!=0){nums[i]=1;
//                c1--;}
//            else {nums[i]=2;
//                c2--;}
//        }
//
//
//    }
//}



//    APPROACH 3
//    Dutch National Flag Algorithm




class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap nums[low] and nums[mid] within the main method or via a corrected swap function
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                // Swap nums[high] and nums[mid]
                swap(nums, high, mid);
                high--;
            }
        }
    }

    // Corrected swap function to work with the array
    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

}
