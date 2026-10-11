package All_Contests.Weekly.contest4;
//https://leetcode.com/contest/weekly-contest-523/problems/three-fibonacci-sum/
public class q1 {class Solution {
    public boolean threeFibonacciSum(int n) {
        int a=0;
        int b=1;
        int sum=a+b;
        while(sum<=n){
            if((a+b+sum)==n)return true;
            a=b;
            b=sum;
            sum=a+b;
        }
        return false;
    }
}
}
