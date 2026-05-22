package DYNAMIC_PROGRAMMING_02;

//https://leetcode.com/problems/longest-palindromic-substring/
public class q14_longest_common_substring {

//    this is almost same as normal palindromic substring but here we are keeping a track wheather greater string at last we will get

    class Solution {
        public String longestPalindrome(String s) {
            int n=s.length();
            String ms="";
            int[][] dp=new int[n][n];
            for(int k=0;k<n;k++){  // loop running how much times
                int i=0,j=k;
                while(j<n){
                    if(i==j){
                        dp[i][j]=1;
                        String sub=s.substring(i,j+1);
                        if(sub.length()>ms.length())ms=sub;
                    }
                    else if(j==i+1){
                        if(s.charAt(i)==s.charAt(j)){
                            dp[i][j]=1;
                            String sub=s.substring(i,j+1);
                            if(sub.length()>ms.length())ms=sub;
                        }
                    }
                    else{
                        if(s.charAt(i)==s.charAt(j)){
                            if(dp[i+1][j-1]==1){
                                dp[i][j]=1;
                                String sub=s.substring(i,j+1);
                                if(sub.length()>ms.length())ms=sub;
                            }
                        }
                    }
                    i++;j++;
                }
            }
            return ms;
        }
    }
}
