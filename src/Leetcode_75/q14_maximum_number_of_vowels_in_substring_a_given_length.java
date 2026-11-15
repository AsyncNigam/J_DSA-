package Leetcode_75;

public class q14_maximum_number_of_vowels_in_substring_a_given_length {
    class Solution {
        public int maxVowels(String s, int k) {
            int left=0;
            int n=s.length();
            int count=0;
            int max_vowel=0;
            for(int right=0; right<n; right++){
                if(isVowel(s.charAt(right)))count++;
                if(right-left+1 > k){
                    if(isVowel(s.charAt(left))){
                        count--;
                    }
                    left++;
                }
                if(right-left+1 == k){
                    max_vowel=Math.max(max_vowel, count);
                }
            }
            return max_vowel;
        }
        boolean isVowel(char ch){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')return true;
            return false;
        }
    }
}
