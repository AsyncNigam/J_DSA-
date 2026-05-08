package DYNAMIC_PROGRAMMING_02;

import java.util.Arrays;

public class q6_edit_distance {
//normal recursive approach

//    class Solution {
//    public int minDistance(String word1, String word2) {
//        int m=word1.length();
//        int n=word2.length();
//        StringBuilder w1=new StringBuilder(word1);
//        StringBuilder w2=new StringBuilder(word2);
//        return minDis(w1,w2,m-1,n-1);
//    }
//
//    int minDis(StringBuilder w1, StringBuilder w2, int i, int j){
//        if(i==-1)return j+1;
//        if(j==-1)return i+1;
//        if(w1.charAt(i)==w2.charAt(j))return minDis(w1,w2,i-1,j-1);
//        else{
//            int delete=1+minDis(w1,w2,i-1,j);
//            int insert=1+minDis(w1,w2,i,j-1);
//            int replace=1+minDis(w1,w2,i-1,j-1);
//            return Math.min(delete,Math.min(insert,replace));
//        }
//    }
//}


//    by memoization
class Solution {
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        StringBuilder w1=new StringBuilder(word1);
        StringBuilder w2=new StringBuilder(word2);
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return minDis(w1,w2,m-1,n-1,dp);
    }

    int minDis(StringBuilder w1, StringBuilder w2, int i, int j,int[][] dp){
        if(i==-1)return j+1;
        if(j==-1)return i+1;
        if(dp[i][j]!=-1)return  dp[i][j];
        if(w1.charAt(i)==w2.charAt(j))return minDis(w1,w2,i-1,j-1,dp);
        else{
            int delete=1+minDis(w1,w2,i-1,j,dp);  // here deleting means we are proceeding to next index of i
            int insert=1+minDis(w1,w2,i,j-1,dp);    // here inserting means we kept the i same j next means lets we have insertede and now +1
            int replace=1+minDis(w1,w2,i-1,j-1,dp);     // here we replace means skip both 2 indices
            return dp[i][j]=Math.min(delete,Math.min(insert,replace));
        }
    }
}
}
