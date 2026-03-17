package Apna_clg_sheet_revision;

public class leetcode_1910_remove_all_occurances_of_a_substring {


//    this is the brute force approach , but this is giving time limit exceed error
//    class Solution {
//        public String removeOccurrences(String s, String part) {
//            while(s.contains(part)){
//                s.replaceFirst(part,"");
//            }
//            return s;
//        }
//    }

    class Solution {
        public String removeOccurrences(String s, String part) {
            StringBuilder str=new StringBuilder(s);
            while(str.indexOf(part)!=-1){
                int sIdx=str.indexOf(part);
                int eIdx=sIdx+part.length();
                str.replace(sIdx,eIdx,"");
            }
            return str.toString();
        }
    }
}
