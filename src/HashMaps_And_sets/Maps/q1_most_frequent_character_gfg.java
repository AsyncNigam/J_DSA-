package HashMaps_And_sets.Maps;

import java.util.HashMap;

//https://www.geeksforgeeks.org/problems/maximum-occuring-character-1587115620/1
public class q1_most_frequent_character_gfg {
    class Solution {
        public char getMaxOccuringChar(String s) {
            HashMap<Character, Integer> map=new HashMap<>();

            // code here
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                if(map.containsKey(ch))
                    map.put(ch,map.get(ch)+1); //overwrite

                else map.put(ch,1);

            }
            int max=0;
            for(char  key:map.keySet())
                max=Math.max(max,map.get(key));

            char ans = 'z' + 1;
            for(char ch : map.keySet() )
                if(map.get(ch)==max && ch<ans)ans=ch;

            return ans;

        }
    }
}
