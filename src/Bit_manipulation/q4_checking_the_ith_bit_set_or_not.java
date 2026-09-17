package Bit_manipulation;

public class q4_checking_the_ith_bit_set_or_not {
//    Problem Statement: Given two integers n and i, return true if the ith bit in the binary representation of n (counting from the least significant bit, 0-indexed) is set (i.e., equal to 1). Otherwise, return false.

//    brute force approach
//    Time Complexity: O(log n), due to integer-to-binary conversion and indexing.
//    Space Complexity: O(log n), for the binary string.

//    class CheckBit {
//        static boolean checkKthBit(int n, int k) {
//            // code here
//            String str=Integer.toBinaryString(n);
//            if(k>=str.length())return false;
//            if(str.charAt(str.length()-k-1)=='1')return true;
//            return false;
//        }
//    }


//    optimal solution
//    time complexity is O(1) and space complexity is O(1)

    class CheckBit {
        static boolean checkKthBit(int n, int k) {
            // code here
            return ( n & (1<<k)) !=0;  // bitwise & gives decimal as output not only the binary so if you think that to make !=0 to ==1 will give you wrong answer
        }
    }

//



}
