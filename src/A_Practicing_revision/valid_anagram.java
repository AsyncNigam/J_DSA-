package A_Practicing_revision;

import java.util.Arrays;

public class valid_anagram {
    class Solution {
        public boolean isAnagram(String s, String t) {
            char[] str=s.toCharArray();
            char[] ttr=t.toCharArray();

            if(str.length!=ttr.length)return false;
            Arrays.sort(str);
            Arrays.sort(ttr);

            for(int i=0;i<str.length;i++){
                if(str[i]!=ttr[i])return false;
            }
            return true;

        }
    }
}
