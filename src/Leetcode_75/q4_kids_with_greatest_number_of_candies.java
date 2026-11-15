package Leetcode_75;

import java.util.ArrayList;
import java.util.List;

public class q4_kids_with_greatest_number_of_candies {
    class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean> arr=new ArrayList<>();
            for(int i=0;i<candies.length;i++){
                if((candies[i]+ extraCandies) >= max(candies))arr.add(true);
                else arr.add(false);
            }
            return arr;

        }
        int max(int[] arr){
            int max=0;
            for(int i=0;i<arr.length;i++){
                if(max<arr[i])max=arr[i];
            }
            return max;
        }
    }
}
