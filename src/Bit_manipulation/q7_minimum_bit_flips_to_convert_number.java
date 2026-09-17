package Bit_manipulation;

public class q7_minimum_bit_flips_to_convert_number {
    class Solution {
        public int minBitFlips(int start, int goal) {
            int ans= start^goal; // store the decimal form of the number after making the distict collection
            int count=0; // to count number of set bits in ans
            while(ans>0){
                ans=ans & (ans-1);
                count++;
            }
            return count;

        }
    }
}
