package A_Practice;

//most likely merge sort

public class q2_leetcode75_q1_merge_strings_alternatively {
    class Solution {
        public String mergeAlternately(String word1, String word2) {
            StringBuilder word=new StringBuilder("");
            int i=0,j=0;
            while(i<word1.length() && j<word2.length()){
                word.append(word1.charAt(i++));
                word.append(word2.charAt(j++));
            }
            while(i<word1.length()) word.append(word1.charAt(i++));
            while(j<word2.length()) word.append(word2.charAt(j++));
            return word.toString();
        }
    }
}
