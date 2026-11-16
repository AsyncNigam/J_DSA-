package Leetcode_75;

public class q19_koko_eating_bananas {
    class Solution {
        public int minEatingSpeed(int[] piles, int h) {
            int left=1;
            int right=0;
            for(int pile : piles){
                right=Math.max(right,pile);
            }
            int ans=right;

            while(left<=right){
                int mid=(left+right)/2;
                if(canEatAll(piles,h,mid)){
                    ans=mid;
                    right=mid-1;
                }
                else left=mid+1;
            }
            return ans;
        }
        boolean canEatAll(int[] piles, int h, int k){
            long totalHours=0;
            for(int pile : piles){
                totalHours+=(pile + k-1)/k;
            }
            return totalHours<=h;
        }
    }
}
