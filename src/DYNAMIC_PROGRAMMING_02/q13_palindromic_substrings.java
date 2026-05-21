package DYNAMIC_PROGRAMMING_02;

public class q13_palindromic_substrings {
//     brute force approach is O(n^3)
//    by finding all the substrings then checking that are they palindrome or not

//    class Solution {
//    public int countSubstrings(String s) {
//        int c=0;
//        for(int i=0;i<s.length();i++){
//            for(int j=i+1;j<=s.length();j++){
//                String sub=s.substring(i,j);
//                if(is_pallindrome(sub))c++;
//            }
//        }
//        return c;
//    }
//    boolean is_pallindrome(String s){
//        for(int i=0, j=s.length()-1;i<=j;i++,j--){
//            if(s.charAt(i)!=s.charAt(j))return false;
//        }
//        return true;
//    }
//}

//    this is the code of O(n^2)
class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int count=0;
        int[][] dp=new int[n][n];
        for(int k=0;k<n;k++){  // loop running how much times
            int i=0,j=k;
            while(j<n){
                if(i==j){
                    dp[i][j]=1;
                    count++;
                }
                else if(j==i+1){
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j]=1;
                        count++;
                    }
                }
                else{
                    if(s.charAt(i)==s.charAt(j)){
                        if(dp[i+1][j-1]==1){
                            dp[i][j]=1;
                            count++;
                        }
                    }
                }
                i++;j++;
            }
        }
        return count;
    }
}
}
