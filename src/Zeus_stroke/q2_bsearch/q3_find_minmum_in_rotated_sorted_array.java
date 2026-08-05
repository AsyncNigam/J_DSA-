package Zeus_stroke.q2_bsearch;

//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

public class q3_find_minmum_in_rotated_sorted_array {
    class Solution {
        public int findMin(int[] arr) {
            int piv=pivot(arr);
            if(piv!=-1)return arr[piv+1];
            return arr[0];
        }
        int pivot(int[] arr){
            int s=0;
            int e=arr.length-1;
            while(s<=e){
                int m=s+(e-s)/2;
                if(m<e && arr[m]>arr[m+1])return m;
                else if(m>s && arr[m]<arr[m-1])return m-1;
                else if(arr[m]<arr[s])e=m-1;
                else s=m+1;
            }
            return -1;

        }
    }
}
