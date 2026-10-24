package Zeus_stroke.q1_arrays;
//https://leetcode.com/problems/string-compression/description/
public class q14_string_compression {
    class Solution {
        public int compress(char[] chars) {
            int write = 0;
            int count = 0;

            for (int read = 0; read < chars.length; read++) {
                count++;

                // Trigger write if at the end of the array or the next character is different
                if (read + 1 == chars.length || chars[read] != chars[read + 1]) {
                    chars[write++] = chars[read];

                    if (count > 1) {
                        for (char c : String.valueOf(count).toCharArray()) {
                            chars[write++] = c;
                        }
                    }
                    count = 0; // Reset for the next character group
                }
            }

            return write;
        }
    }
}
