package Sliding_window;

import java.util.HashSet;

public class q3_longest_substring_without_repeating_characters {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int start=0;
            int end=0;
            int len=0;
            HashSet<Character> set=new HashSet<>();
            int max_len=0;

            while(end < s.length()){
                char ch=s.charAt(end);
                if(!set.contains(ch)){
                    set.add(ch);
                    end++;
                }
                else{
                    len=end-start;
                    max_len=Math.max(len, max_len);
                    while(s.charAt(start)!=s.charAt(end)){
                        set.remove(s.charAt(start));
                        start++;
                    }
                    start++;
                    end++;
                }
            }
            len=end-start;
            max_len=Math.max(len, max_len);
            return max_len;
        }
    }
}
