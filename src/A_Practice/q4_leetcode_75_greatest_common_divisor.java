package A_Practice;

//https://leetcode.com/problems/greatest-common-divisor-of-strings/?envType=study-plan-v2&envId=leetcode-75

//https://www.youtube.com/watch?v=AMw6kxKDwg0

//the approach is that between 2 strings , 1st find the gcd of their length then return the substring up to the gcd of number


public class q4_leetcode_75_greatest_common_divisor {
    class Solution {
        public String gcdOfStrings(String str1, String str2) {
            int a=str1.length();
            int b=str2.length();
            int gcd=gcdInt(a,b);

//2 strings gcd can not be found if
            if(!(str1+str2).equals(str2+str1))return ""; // here use .equals() not ==
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
