package Zeus_stroke.q12_bit_manipulation;

public class q6_number_of_1_bits {
//    here time complexity is O(logn) because the time complexity of Integer.toBinaryString(n); is O(logn) and the for loop runs O(logn ) times , becuase the length of the binary string is log2n , n is the decimal numebnr right

    class Solution {
        public int hammingWeight(int n) {
            String binary=Integer.toBinaryString(n);
            int count =0;
            for(int i=0;i<binary.length();i++){
                if(binary.charAt(i)=='1')count++;
            }
            return count;
        }
    }
}
