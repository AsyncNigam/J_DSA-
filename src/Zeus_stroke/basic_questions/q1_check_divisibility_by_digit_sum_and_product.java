package Zeus_stroke.basic_questions;

public class q1_check_divisibility_by_digit_sum_and_product {
    class Solution {
        public boolean checkDivisibility(int n) {
            int dum=n;
            int s=0;
            int p=1;
            while(dum>0){
                s+=dum%10;
                p*=dum%10;
                dum/=10;
            }

            if(n%(s+p)==0)return true;
            return false;
        }
    }
}
