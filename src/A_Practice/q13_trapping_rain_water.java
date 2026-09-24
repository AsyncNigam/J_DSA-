package A_Practice;

public class q13_trapping_rain_water {

//    brute force approach, here tc is O(n^2) , space complexity is O(1)
class Solution1 {
    public int trap(int[] height) {
        int total_water=0;
        int n=height.length;
        for(int i=0;i<n;i++){
            int LeftMax=(i>0) ? left(height,i-1) : 0;
            int RightMax=(i < (n-1)) ? right(height,i+1) : 0;
            int water=Math.min(LeftMax,RightMax)-height[i];
            if(water>0)total_water+=water;
        }
        return total_water;
    }
    int left(int[] arr, int i){
        int max=0;
        for(int j=i;j>=0;j--){
            max=Math.max(max,arr[j]);
        }
        return max;
    }
    int right(int[] arr, int i){
        int max=0;
        for(int j=i;j<arr.length;j++){
            max=Math.max(max,arr[j]);
        } return max;
    }
}

//next better approach with this we gonna create two more arrays in which we will be storing the left max for each element and right max for each element
class Solution2 {
    public int trap(int[] height) {
        int n=height.length;
        int[] left=new int[n];
        int[] right=new int[n];


        int i=0;
        int j=n-1;
        left[i++]=height[0];
        right[j--]=height[n-1];
        while(i<n && j>=0){
            left[i]=Math.max(left[i-1],height[i]);
            right[j]=Math.max(right[j+1],height[j]);
            i++;
            j--;
        }

        int total_water=0;
        for(int k=0;k<n;k++){
            int water=Math.min(left[k],right[k])-height[k] ;
            if(water>0) total_water +=water;
        }
        return total_water;
    }
}



}
