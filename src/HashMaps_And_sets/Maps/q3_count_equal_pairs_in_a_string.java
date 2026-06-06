package HashMaps_And_sets.Maps;

import java.util.HashMap;
//https://www.geeksforgeeks.org/problems/count-number-of-equal-pairs-in-a-string0520/1
public class q3_count_equal_pairs_in_a_string {
    // User function Template for Java

//    here time complexity O(n) and space complexity is O(n)
    class Sol {
        long equalPairs(String s) {
            // your code here
            HashMap<Character, Long> map=new HashMap<>();
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                map.put(ch,map.getOrDefault(ch,0l)+1);  // here 0l for long literal l
            }
            long count=0;
            for(char ch:map.keySet()){
                long freq=map.get(ch);
                count+=freq*freq;
            }
            return count;
        }
    }
}
