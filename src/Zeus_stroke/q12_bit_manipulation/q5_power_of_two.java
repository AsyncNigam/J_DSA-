package Zeus_stroke.q12_bit_manipulation;

public class q5_power_of_two {

//     the approach is that every number that power of 2 are in the format like single 1 with trailing 0s like 4 100 , 8 1000

//    consider the example 8, previous element of 8 binary is 1000 is 7 whose binary is 111 now if you & them then you will get 0

//    the thing is number should be at least greater than 0 for power of 2

//    time and space complexity are O(1)

    class Solution {
        public boolean isPowerOfTwo(int n) {
            return (n > 0) && ((n & (n-1))==0);
        }
    }
}
