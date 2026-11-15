package Leetcode_75;

import java.util.ArrayList;

public class q6_reverse_vowels_of_string {
    class Solution {
        public String reverseVowels(String s) {
            StringBuilder str = new StringBuilder(s);
            ArrayList<Character> arr=new ArrayList<Character>();
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if(is_vowel(ch))arr.add(ch);
            }
            int vowel_idx=arr.size()-1;
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if(is_vowel(ch)){
                    str.setCharAt(i,arr.get(vowel_idx--));
                }
            }
            return str.toString();
        }

        boolean is_vowel(char ch){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')return true;
            return false;
        }

    }
}
