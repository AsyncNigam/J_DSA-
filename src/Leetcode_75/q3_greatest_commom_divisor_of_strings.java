package Leetcode_75;

public class q3_greatest_commom_divisor_of_strings {
    class Solution {
        public String gcdOfStrings(String str1, String str2) {
            int a=str1.length();
            int b=str2.length();
            int gcd=gcdInt(a,b);
            if(!(str1+str2).equals(str2+str1))return "";
            return str1.substring(0,gcd);

        }
        int gcdInt(int a,int b){
            for(int i=Math.min(a,b);i>0;i--){
                if(a%i==0 && b%i==0)return i;
            }
            return 1;
        }
    }
}
