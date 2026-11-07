package All_Contests.Biweekly.contest4;
//https://leetcode.com/contest/biweekly-contest-195/problems/count-valid-substrings-i/description/
public class q1 {

//    This is the brute-force approach and it will give you TLE because its time complexity is O(n^2).
    class Solution {
        public long countValidSubstrings(String s) {
            int n=s.length();
            int count=0;
            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    if((j-i +1)>=3 && s.charAt(j-2)=='a' && s.charAt(j-1)=='b' && s.charAt(j)=='c')break;
                    count++;
                }
            }
            return count;
        }
    }
}
