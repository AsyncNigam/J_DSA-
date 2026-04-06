package A_Practicing_revision;

public class contains_duplicate {
//    brute force method with time complexity O(n^2)

//    class Solution {
//        public boolean containsDuplicate(int[] nums) {
//            for(int i=0;i<nums.length-1;i++){
//                for(int j=i+1;j<nums.length;j++){
//                    if(nums[i]==nums[j])return true;
//                }
//            }
//            return false;
//        }
//    }

//    for lesser time 1st sort with merge sort this is also not optimized
class Solution {
    public boolean containsDuplicate(int[] nums) {
        merge(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])return true;
        }
        return false;
    }

    void merge(int[] arr){
        int n=arr.length;
        if(n==1)return;
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];

        int idx=0;
        for(int i=0;i<a.length;i++)a[i]=arr[idx++];
        for(int i=0;i<b.length;i++)b[i]=arr[idx++];

        merge(a);
        merge(b);
        check(a,b,arr);
    }

    void check(int[] a,int[] b,int[] arr){
        int i=0;
        int j=0;
        int k=0;

        while(i<a.length && j<b.length){
            if(a[i]<b[j])arr[k++]=a[i++];
            else arr[k++]=b[j++];
        }

        while(i<a.length)arr[k++]=a[i++];
        while(j<b.length)arr[k++]=b[j++];

    }
}




}
