package Zeus_stroke.q5_hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
//https://leetcode.com/problems/determine-if-two-strings-are-close/?envType=study-plan-v2&envId=leetcode-75


// you can also try without hashmap with array only
 public class q4_determine_if_two_strings_are_close_leetcode_1657 {
    class Solution {
        public boolean closeStrings(String word1, String word2) {
            if(word1.length() != word2.length())return false ;
            HashMap<Character, Integer> map1=new HashMap<>();

            HashMap<Character, Integer> map2=new HashMap<>();
            for(char ch : word1.toCharArray())map1.put(ch,map1.getOrDefault(ch, 0)+1);

            for(char ch : word2.toCharArray()){
                if(!map1.containsKey(ch))return false;
                map2.put(ch,map2.getOrDefault(ch, 0)+1);
            }

            List<Integer> arr1=new ArrayList<>(map1.values());
            List<Integer> arr2=new ArrayList<>(map2.values());

            Collections.sort(arr1);
            Collections.sort(arr2);

            for(int i=0;i < arr1.size();i++){
                if(!arr1.get(i).equals(arr2.get(i)))return false;
            }

            return true;
        }
    }
}
