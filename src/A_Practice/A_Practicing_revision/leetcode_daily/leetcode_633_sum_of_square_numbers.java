package A_Practice.A_Practicing_revision.leetcode_daily;

public class leetcode_633_sum_of_square_numbers {
    class Solution {
        public boolean judgeSquareSum(int c) {
            int low = 0; int high=(int)(Math.sqrt(c));
            while(low<=high){
                double sq=Math.pow(low,2)+Math.pow(high,2);
                if(sq<c)low++;
                else if(sq>c)high--;
                else return true;
            }
            return false;
        }

    }
}
