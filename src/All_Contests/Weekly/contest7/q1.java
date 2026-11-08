package All_Contests.Weekly.contest7;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/contest/weekly-contest-527/problems/find-mismatched-segments-between-two-strings/
public class q1 {
    class Solution {
        public List<List<String>> findMismatchedSegments(String s1, String s2) {
            int i=0;
            int n=s1.length();
            List<List<String>> ans=new ArrayList<>();
            boolean isPrev=false;
            for(int j=0;j<n;j++){
                if(s1.charAt(j)!=s2.charAt(j)){
                    if(!isPrev){
                        isPrev=true;
                        i=j;
                    }
                }
                else if(s1.charAt(j)==s2.charAt(j) && isPrev){
                    List<String> list=new ArrayList<>();
                    list.add(s1.substring(i,j));
                    list.add(s2.substring(i,j));
                    ans.add(list);
                    isPrev=false;
                }
            }
            if(isPrev){
                List<String> list=new ArrayList<>();
                list.add(s1.substring(i,n));
                list.add(s2.substring(i,n));
                ans.add(list);
            }
            return ans;
        }
    }
}
