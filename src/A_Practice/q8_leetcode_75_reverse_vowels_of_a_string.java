package A_Practice;

import java.util.ArrayList;

//https://leetcode.com/problems/reverse-vowels-of-a-string/?envType=study-plan-v2&envId=leetcode-75

//the main thing is in replaceing char at stringbuilder needs start and end index as well as the string , so to we have used setCharAt() instead of replacing


public class q8_leetcode_75_reverse_vowels_of_a_string {
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
