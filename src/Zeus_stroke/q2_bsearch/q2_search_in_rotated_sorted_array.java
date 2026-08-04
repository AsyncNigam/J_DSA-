package Zeus_stroke.q2_bsearch;

public class q2_search_in_rotated_sorted_array {
    class Solution {

        public int search(int[] arr, int target) {
            int s=0;
            int e=arr.length-1;
            int piv=pivot(arr);
            if(piv!=-1){
                int bs1=bsearch(arr,target,s,piv);
                if(bs1!=-1)return bs1;
                else return bsearch(arr,target,piv+1,e);
            }
            return bsearch(arr,target,s,e);
        }
        int pivot(int[] arr){
            int s=0;
            int e=arr.length-1;
            while(s<=e){
                int m=s+(e-s)/2;
                if(m<e && arr[m]>arr[m+1])return m;
                else if(m>s && arr[m]<arr[m-1])return m-1;
                else if(arr[m]<=arr[s])e=m-1;
                else s=m+1;
            }
            return -1;
        }
        int bsearch(int[] arr,int target, int s,int e){
            while(s<=e){
                int m=s+(e-s)/2;
                if(arr[m]==target)return m;
                else if(arr[m]<target)s=m+1;
                else e=m-1;
            }
            return -1;
        }

    }
}
