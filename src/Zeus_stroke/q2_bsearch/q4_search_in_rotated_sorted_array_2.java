package Zeus_stroke.q2_bsearch;

public class q4_search_in_rotated_sorted_array_2 {
    class Solution {
        public boolean search(int[] arr, int target) {
            int s=0;
            int e=arr.length-1;
            while(s<=e){
                int m=s+(e-s)/2;
                if(arr[m]==target)return true;
                if(arr[m]==arr[s] && arr[m]==arr[e]){
                    s++;
                    e--;
                    continue; // this will compute new m
                }

                else if(arr[s]<=arr[m]){
                    if(arr[s]<=target && target<arr[m]) e=m-1;
                    else s=m+1;
                }

                else {
                    if(arr[m]<target && target<=arr[e])s=m+1;
                    else e=m-1;
                }
            }
            return false;
        }
    }
}
