package A_Practice;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/set-mismatch/description/?envType=problem-list-v2&envId=dsa-linear-shoal-array-ii

public class q6_set_mismatch {
//    this will tle because the time complexity of the function containsValue() is O(k)
//    class Solution {
//        public int[] findErrorNums(int[] nums) {
//            Map<Integer,Integer> map=new HashMap<Integer,Integer>();
//            int[] ans=new int[2];
//            int n=nums.length;
//            int sum=0;
//            for(int i=0;i<n;i++){
//                if(map.containsValue(nums[i])){
//                    ans[0]=nums[i];
//                }
//                map.put(i,nums[i]);
//                sum+=nums[i];
//            }
//            ans[1]=ans[0]+(n*(n+1)/2)-sum;
//            return ans;
//        }
//    }

//    so to fix this instead of storing nums[i] as value we will store it as key ,

//    time complexity of containsKey(nums[i]) is O(1)
class Solution {
    public int[] findErrorNums(int[] nums) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        int[] ans=new int[2];
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                ans[0]=nums[i];
            }
            map.put(nums[i],i); // actually i is not needed to store as a value we just store it bcz in put() we have to give 2 arguments
            sum+=nums[i];
        }
        ans[1]=ans[0]+(n*(n+1)/2)-sum;
        return ans;
    }
}


//my old approach same time complexity o(n)



//    class Solution {
//    public int[] findErrorNums(int[] arr) {
//
//        int[] nums=new int[2];
//    int i=0;
//    while(i< arr.length){
//            int correct=arr[i]-1;
//
//                if(arr[i]!=arr[correct]){
//
//                    swap(arr,i,correct);
//
//                }
//                else   i++;
//            }
//    for(int j=0;j<arr.length;j++){
//        if(arr[j]!=j+1){
//            nums[0]=arr[j];
//            nums[1]=j+1;
//        }
//    }
//
//    return nums;
//    }
//
//    void swap(int arr[],int i,int correct ){
//        int temp=arr[i];
//        arr[i]=arr[correct];
//        arr[correct]=temp;
//
//    }
//}
}
