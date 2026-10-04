package All_Contests.Weekly.contest3;

//https://leetcode.com/problems/minimum-rotations-to-dial-a-number-i/
public class q1 {
    class Solution {
        public int minRotations(String s) {
            int total_rotation=0;
            int n=s.length();
            if(s.charAt(0)>0){
                int dig=s.charAt(0)-'0';
                total_rotation=Math.min(10-dig, dig);
            }
            for(int i=0; i<n-1; i++){
                int digit=s.charAt(i)-'0';
                int n_digit=s.charAt(i+1)-'0';
                int diff=Math.abs(digit-n_digit);
                int rotation=Math.min(diff, 10-diff);
                total_rotation+=rotation;
            }
            return total_rotation;
        }
    }
}
