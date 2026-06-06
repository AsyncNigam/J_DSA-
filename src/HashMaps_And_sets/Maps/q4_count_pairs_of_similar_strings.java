package HashMaps_And_sets.Maps;

import java.util.HashMap;
import java.util.HashSet;

//https://leetcode.com/problems/count-pairs-of-similar-strings/description/

public class q4_count_pairs_of_similar_strings {
    class Solution {
        public int similarPairs(String[] words) {
            HashMap<HashSet<Character>,Integer> map=new HashMap<>(); // here we are keeping set as the type of key of map
            for(String word: words){
                HashSet<Character> hs=new HashSet<>();
                for(char ch:word.toCharArray()){
                    hs.add(ch);   // we just add all character to set and if duplicate it will not store
                }
                map.put(hs,map.getOrDefault(hs,0)+1); // if set already exists of same character then add 1 otherwise default is 0
            }
            int count=0;
            for(HashSet<Character> set:map.keySet()){
                int freq=map.get(set);
                count+=freq*(freq-1)/2;   // here we are forming pair not just count that's why we are taking fre*(freq-1)/2
            }
            return count;
        }
    }
}
