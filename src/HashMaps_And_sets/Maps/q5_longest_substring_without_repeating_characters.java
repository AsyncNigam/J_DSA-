package HashMaps_And_sets.Maps;

import java.util.HashSet;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/


//keep i and j at 0 then start if in set j not present then add and continue until we get that in set there is char at j same , if same higala , let's gote character repeat hela then i kuy sei character ra 1st occurance ra just next char ku aniba then j++ and maintain things like len max len etc., while bringing i to 1st occurance of repeated char all remove those characters across which we are going through i
public class q5_longest_substring_without_repeating_characters {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            if(s.length()==0)return 0;
            HashSet<Character> set=new HashSet<>();
            int max_len=1;
            int i=0,j=0;
            while(j<s.length()){
                char ch=s.charAt(j);
                if(!set.contains(ch)){
                    set.add(ch);
                    j++;
                }
                else{
                    int len=j-i;
                    max_len=Math.max(max_len,len);

                    while(s.charAt(i)!=s.charAt(j)){
                        set.remove(s.charAt(i));
                        i++;
                    }
                    i++;
                    j++;
                }

            }
            int len=j-i;
            max_len=Math.max(max_len,len);
            return max_len;

        }
    }

//    also can do with hashmap and storing the index and directly bring i to index+1
}
