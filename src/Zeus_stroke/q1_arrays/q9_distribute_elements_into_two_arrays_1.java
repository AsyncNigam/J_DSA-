package Zeus_stroke.q1_arrays;

public class q9_distribute_elements_into_two_arrays_1 {
    class Solution {
        public int[] resultArray(int[] nums) {
            int n=nums.length;
            int[] arr1=new int[n/2];
            int[] arr2=new int[n/2];

            arr1[0]=nums[0];
            arr2[0]=nums[1];

            int j=1;
            int k=1;

            for(int i=2;i<n;i++){
                if(arr1[j]>arr2[k]){
                    arr1[j+1]=nums[i];
                    j++;
                }
                else{
                    arr2[k+1]=nums[i];
                    k++;
                }
            }

            int[] result=new int[n];
            int i=0;
            for(int el:arr1){
                nums[i++]=el;
            }
            for(int el:arr2){
                nums[i++]=el;
            }

            return result;
        }
    }
}
