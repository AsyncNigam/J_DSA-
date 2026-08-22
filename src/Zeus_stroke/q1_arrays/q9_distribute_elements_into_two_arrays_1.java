package Zeus_stroke.q1_arrays;

public class q9_distribute_elements_into_two_arrays_1 {
    class Solution {
        public int[] resultArray(int[] nums) {
            int n=nums.length;

            int[] arr1=new int[n];
            int[] arr2=new int[n];

            arr1[0]=nums[0];
            arr2[0]=nums[1];

            int j=1;
            int k=1;

            for(int i=2;i<n;i++){
                if(arr1[j-1]>arr2[k-1]){
                    arr1[j++]=nums[i];

                }
                else {
                    arr2[k++]=nums[i];
                }
            }


            int[] result=new int[n];
            int idx=0;
            for(int i=0;i<j;i++){
                result[idx++]=arr1[i];
            }
            for(int i=0;i<k;i++){
                result[idx++]=arr2[i];
            }

            return result;
        }
    }
}
