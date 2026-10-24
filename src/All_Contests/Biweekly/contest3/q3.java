package All_Contests.Biweekly.contest3;
//https://leetcode.com/problems/count-magical-substring-pairs-i/
public class q3 {
    class Solution {
    public int countMagicalPairs(String s) {
        int n=s.length();
        int totalPairs=0;

        for(int j=0;j<n-1;j++){
            int[] leftCount=new int[27];
            boolean[] seenleft=new boolean[26];
            int distictLeft=0;

            for(int i=j;i>=0;i--){
                int charIdx=s.charAt(i)-'a';
                if(!seenleft[charIdx]){
                    seenleft[charIdx]=true;
                    distictLeft++;
                }
                leftCount[distictLeft]++;
            }

            boolean[] seenright=new boolean[26];
            int distictRight=0;

            for(int k=j+1;k<n;k++){
                int charIdx=s.charAt(k)-'a';
                if(!seenright[charIdx]){
                    seenright[charIdx]=true;
                    distictRight++;
                }
                totalPairs+=leftCount[distictRight];
            }
        }
        return totalPairs;
    }
}
}
