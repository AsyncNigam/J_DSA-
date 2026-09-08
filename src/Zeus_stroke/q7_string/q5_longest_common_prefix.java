package Zeus_stroke.q7_string;

public class q5_longest_common_prefix {
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if(strs.length==0 || strs==null)return "";
            String prefix=strs[0];
            for(int i=0;i<strs.length;i++){
                while(strs[i].indexOf(prefix)!=0){  // as prefix is needed if only index 0 then prefix if even it is 1 it can not be
                    prefix=prefix.substring(0,prefix.length()-1);
                    if(prefix.isEmpty())return "";

                }
            }
            return prefix;
        }
    }
}
