package All_Contests.Biweekly.contest4;

//https://leetcode.com/contest/biweekly-contest-195/problems/count-valid-substrings-ii/
public class q3 {
    class Solution {
        public long countValidSubstrings(String s) {
            int n=s.length();
            long count=0;

            int lastA=-1;
            int lastAB=-1;
            int left=0;

            for(int j=0;j<n;j++){
                char ch=s.charAt(j);
                if(ch=='a')lastA=j;
                else if(ch=='b' && lastA!=-1)lastAB=Math.max(lastAB, lastA);
                else if(ch=='c' && lastAB!=-1)left=Math.max(left, lastAB+1);

                count+=j-left+1;
            }

            return count;

        }
    }
}
