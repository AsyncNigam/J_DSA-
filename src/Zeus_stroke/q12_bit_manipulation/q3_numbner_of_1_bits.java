package Zeus_stroke.q12_bit_manipulation;

public class q3_numbner_of_1_bits {
    class Solution {
        public int hammingWeight(int n) {
            int count=0;
            while(n>0){
                if((n & 1) == 1)count++;
                n=n>>1;
            }
            return count;
        }
    }
}
