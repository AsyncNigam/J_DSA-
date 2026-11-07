package Sliding_window;

public class q6_number_of_substrings_containg_all_three {

//    The answer is O(n^2) time complexity and it is the brute force approach,  Giving us TLE.
    class Solution{
        static int numberOfSubstrings(String s) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                int[] hash = new int[3];
                for (int j = i; j < s.length(); j++) {
                    hash[s.charAt(j)-'a'] = 1;
                    if (hash[0] + hash[1] + hash[2] == 3) count++;
                }
            }
            return count;
        }
    }

//    Slightly optimize the brute-force approach but still it will give us TLE. There we just slightly optimize the if condition: if we find a substring then even after this substring, adding all that will also increase the count. Instead of going with `count` we just calculate their count and then break.
class Solution2 {
    public int numberOfSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] hash = new int[3];
            for (int j = i; j < s.length(); j++) {
                hash[s.charAt(j)-'a'] = 1;
                if (hash[0] + hash[1] + hash[2] == 3){
                    count+=s.length()-j;
                    break;
                }
            }
        }
        return count;
    }
}

    class Solution3 {
        public int numberOfSubstrings(String s) {
            int[] lastSeen = {-1, -1, -1};
            int count = 0;

            for (int i = 0; i < s.length(); i++) {
                lastSeen[s.charAt(i) - 'a'] = i;

                if (lastSeen[0] != -1 && lastSeen[1] != -1 && lastSeen[2] != -1) {
                    count += 1 + Math.min(lastSeen[0], Math.min(lastSeen[1], lastSeen[2]));
                }
            }

            return count;
        }
    }
}
