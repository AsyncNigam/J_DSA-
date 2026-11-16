package Leetcode_75;

public class q20_minimum_flips_to_make_a_OR_b_to_c {
    class Solution {
        public int minFlips(int a, int b, int c) {
            int flips = 0;
            for (int i = 0; i < 32; i++) {
                int bitA = (a >> i) & 1;
                int bitB = (b >> i) & 1;
                int bitC = (c >> i) & 1;
                if (bitC == 1) {
                    // If c is 1, we need at least one of a or b to be 1
                    if (bitA == 0 && bitB == 0) {
                        flips += 1;
                    }
                } else {
                    // If c is 0, both a and b must be 0
                    if (bitA == 1) flips += 1;
                    if (bitB == 1) flips += 1;
                }
            }

            return flips;
        }
    }
}
