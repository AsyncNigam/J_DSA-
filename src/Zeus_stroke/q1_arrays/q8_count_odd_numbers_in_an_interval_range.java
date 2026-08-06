package Zeus_stroke.q1_arrays;

public class q8_count_odd_numbers_in_an_interval_range {
//    https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/description/

//    my brute force approach is
class Solution {
    public int countOdds(int low, int high) {int c=0;
        for(int i=low;i<=high;i++){
            if(i%2!=0)c++;
        }
        return c;
    }
}

//but the constraint is 10^9

//    more optimized approach is
class Solution2 {
    public int countOdds(int low, int high) {

        return (high+1)/2 - low/2;
    }
}
}
