package A_Practicing_revision;

public class merge_2_sorted_arrays {

//    this is cheating method we are using extra space but leetcode can not know

//    https://leetcode.com/problems/merge-sorted-array/

//    class Solution {
//        public void merge(int[] a, int m, int[] b, int n) {
//            int[] c=new int[m+n];
//            int i=0,j=0,k=0;
//            while(i<m&&j<n){
//                if(a[i]<=b[j])c[k++]=a[i++];
//                else c[k++]=b[j++];
//            }
//            while(i< m)c[k++]=a[i++];
//            while(j<n)c[k++]=b[j++];
//
//            for(int l=0;l<m+n;l++){
//                a[l]=c[l];
//            }
//        }
//    }

//    basic brute force approach  its t.c is O(n^2)



//    class Solution {
//    public void merge(int[] a, int m, int[] b, int n) {
//        for(int i=0;i<n;i++){
//            a[m+i]=b[i];
//        }
//
//
//      for(int i=0;i<m+n-1;i++){
//        for(int j=0;j<m+n-1-i;j++){
//            if(a[j]>a[j+1]){
//                int temp=a[j];
//                a[j]=a[j+1];
//                a[j+1]=temp;
//            }
//        }
//      }
//    }
//}



//    the optimal solution is we will check from last add
class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;

        while(j>=0){
            if(i>=0 && a[i]>b[j]){
                a[k--]=a[i--];
            }
            else a[k--]=b[j--];
        }
    }
}

}
