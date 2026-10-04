package All_Contests.Weekly.contest3;

//https://leetcode.com/problems/minimum-rotations-to-dial-a-number-ii/
public class q2 {
    class Solution {
        public int minRotations(int n, String s) {
            int total=without_reverse(n,s);
            int first = s.charAt(0) - '0';
            int last_digit = s.charAt(n - 1) - '0';
            int unchange = Math.min(10 - first, first);
            int reversed = Math.min(10 - last_digit, last_digit);

            int min_new_total = total - unchange + reversed;
            for(int i=0;i<n-1;i++){
                int dig=s.charAt(i)-'0';
                int next=s.charAt(i+1)-'0';
                int last=s.charAt(n-1)-'0';

                int diff1=Math.abs(dig-next);
                int normal=Math.min(10-diff1, diff1);

                int diff2=Math.abs(dig-last);
                int rev=Math.min(10-diff2, diff2);

                int new_total=total-normal+rev;
                min_new_total=Math.min(new_total, min_new_total);
            }
            return Math.min(total, min_new_total);
        }
        int without_reverse(int n, String s){
            int total_rotation=0;
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
