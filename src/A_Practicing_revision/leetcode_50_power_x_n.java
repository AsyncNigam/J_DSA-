package A_Practicing_revision;

public class leetcode_50_power_x_n {

//     power of x^n , here taken consider to -ve and larger powers , so int is converted to long
    class Solution {
        public double myPow(double x, int n) {
            if(n==0)return 1;
            long N = n;
            if(N<0){
                x=1/x;
                N=-N;
            }
            return power(x,N);
        }
        double power(double x,long n){
            if(n==1)return x;
            double half=power(x,n/2);
            if(n%2==0)return half*half;
            else return half*half*x;
        }
    }
}
