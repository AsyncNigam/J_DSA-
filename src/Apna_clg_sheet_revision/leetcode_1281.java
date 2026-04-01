package Apna_clg_sheet_revision;

//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

public class leetcode_1281 {

    class Solution {
        public int subtractProductAndSum(int n) {
            int pro=1;
            int sum=0;
            while(n>0){
                pro*=n%10;
                sum+=n%10;
                n/=10;

            }
            return pro-sum;
        }
    }
}
