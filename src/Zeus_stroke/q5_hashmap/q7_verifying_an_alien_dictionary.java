package Zeus_stroke.q5_hashmap;

import java.util.HashMap;

public class q7_verifying_an_alien_dictionary {
    class Solution {
        public boolean isAlienSorted(String[] words, String order) {
            HashMap<Character, Integer> map=new HashMap<>();  //instead of hashmap you can directly store in an array with at i index order.charAt(i)-'a'
            for(int i=0;i<order.length();i++){
                map.put(order.charAt(i),i);
            }
            for(int i=0;i<words.length-1;i++){
                String ch=words[i];
                String ch2=words[i+1];

                int j=0;
                boolean isSorted=false;
                while(j<ch.length() && j<ch2.length()){
                    if(map.get(ch.charAt(j))>map.get(ch2.charAt(j)))return false;
                    else if(map.get(ch.charAt(j))<map.get(ch2.charAt(j))){
                        isSorted=true;
                        break; // current pair sorted correctly move to next
                    }
                    else j++;
                }
                // If all compared characters were equal, the longer word must not come first
                if(!isSorted && ch.length()>ch2.length()){
                    return false;
                }
            }
            return true;
        }
    }
}
