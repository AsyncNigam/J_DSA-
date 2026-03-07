package Apna_clg_sheet_revision.leetcode_daily;

public class leetcode_day_2 {

//    Given a binary string s ​​​​​without leading zeros, return true​​​ if s contains at most one contiguous segment of ones. Otherwise, return false.

    class Solution {
        public boolean checkOnesSegment(String s) {


            if(s.length()==1)return true;
            if(s.length()==0)return false;
            int one_count=0;
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i)=='0' && s.charAt(i+1)=='1')return false;
            }
            return true;
        }
    }
}
