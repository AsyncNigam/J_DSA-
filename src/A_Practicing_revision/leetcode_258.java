package A_Practicing_revision;

public class leetcode_258 {
    class Solution {
        public int addDigits(int num) {
            int sx=s(num);
            int digits=(int)Math.log10(sx)+1;
            while(digits>1){
                sx=s(sx);
                digits=(int)Math.log10(sx)+1;
            }
            return sx;

        }
        int s(int num){
            int sum=0;
            while(num>0){
                sum+=num%10;
                num=num/10;
            }
            return sum;
        }


    }
}
